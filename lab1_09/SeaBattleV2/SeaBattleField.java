import java.util.Random;
public class SeaBattleField {

    public Ship[] ships;
    public byte[][] fieldState;

    public void createField() {
        Random random = new Random();
        System.out.println("createField");

        byte shipIndex = 0;
        byte count = 1;
        for (byte i = 4; i >= 1; i--) {
            for (byte j = 1; j <= count; j++) {
                while (true) {
                    byte x;
                    byte y;
                    boolean isHorizontal = random.nextBoolean();

                    if (isHorizontal) {
                        x = (byte) random.nextInt(10 - i);
                        y = (byte) random.nextInt(10);
                    } else {
                        x = (byte) random.nextInt(10);
                        y = (byte) random.nextInt(10 - i);
                    }

                    if (isHorizontal) {
                        byte[] row = fieldState[y];
                        for (byte k = x; k < x + i; k++) {
                            if (row[k] == 3) {
                                break;
                            }
                        }
                        // все ок, корабль вместился
                        for (byte k = x; k < x + i; k++) {
                            row[k] = 3;
                        }
                        ships[shipIndex] = new Ship(i, x, y, (byte) (x + i), y);
                        shipIndex++;
                        break;
                    } else {
                        for (byte k = y; k < y + i; k++) {
                            if (fieldState[y][x] == 3) {
                                break;
                            }
                        }
                        // все ок, корабль вместился
                        for (byte k = y; k < y + i; k++) {
                            fieldState[k][x] = 3;
                        }
                        ships[shipIndex] = new Ship(i, x, y, x, (byte) (y + 1));

                        System.out.println(ships[shipIndex].getSize());
                        shipIndex++;
                        break;

                    }
                }
            }
            count++;
        }
    }

    public SeaBattleField() {
        fieldState = new byte[10][10];
        ships = new Ship[10];
        createField();
    }

    public void showField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(fieldState[i][j] + " ");
            }
            System.out.println();
        }
    }
}