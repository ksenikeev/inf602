import java.util.Scanner;

public class Labirint {
    static int[][] labirint = {
            {1,0,1,1,1},
            {1,0,0,1,1},
            {1,1,0,1,1},
            {1,0,0,0,1},
            {1,1,1,0,1}
    };
    static char[][] gameStatus = {
            {'-','*','-','-','-'},
            {'-','-','-','-','-'},
            {'-','-','-','-','-'},
            {'-','-','-','-','-'},
            {'-','-','-','-','-'},
    } ;
    static int rowPosition = 0;
    static int columnPosition = 1;
    static int rowExit = 4;
    static int columnExit = 3;
    static int stepCount = 0;

    public static void main(String[] args) {
        while (true) {
            showStatus();
            String direction = inputDirection();
            char wall = '\u2588';
            switch (direction) {
                case "u":
                case "U":
                    if (rowPosition > 0) {
                        if (labirint[rowPosition - 1][columnPosition] == 0) {
                            gameStatus[rowPosition][columnPosition] = '#';
                            --rowPosition;
                            gameStatus[rowPosition][columnPosition] = '*';
                        } else {
                            gameStatus[rowPosition - 1][columnPosition] = wall;
                        }
                    }
                    break;
                case "d":
                case "D":
                    if (rowPosition < labirint.length - 1) {
                        if (labirint[rowPosition + 1][columnPosition] == 0) {
                            gameStatus[rowPosition][columnPosition] = '#';
                            ++rowPosition;
                            gameStatus[rowPosition][columnPosition] = '*';
                        } else {
                            gameStatus[rowPosition + 1][columnPosition] = wall;
                        }
                    }
                    break;
                case "l":
                case "L":
                    if (columnPosition > 0) {
                        if (labirint[rowPosition][columnPosition - 1] == 0) {
                            gameStatus[rowPosition][columnPosition] = '#';
                            --columnPosition;
                            gameStatus[rowPosition][columnPosition] = '*';
                        } else {
                            gameStatus[rowPosition][columnPosition - 1] = wall;
                        }
                    }
                    break;

                case "r":
                case "R":
                    if (columnPosition < labirint[0].length - 1) {
                        if (labirint[rowPosition][columnPosition + 1] == 0) {
                            gameStatus[rowPosition][columnPosition] = '#';
                            ++columnPosition;
                            gameStatus[rowPosition][columnPosition] = '*';
                        } else {
                            gameStatus[rowPosition][columnPosition + 1] = wall;
                        }
                    }
                    break;
            }
            if (rowPosition == rowExit && columnPosition == columnExit) {
                System.out.println("Победа за " + stepCount + " шагов");
                showStatus();

                break;
            }
        }

    }
    public static void showStatus() {
        for (int i = 0;i < gameStatus.length; i++) {
            for (int j = 0; j < gameStatus[i].length; j++) {
                System.out.print(gameStatus[i][j]);
            }
            System.out.println();
        }
    }

    public static String inputDirection() {
        while (true) {
            System.out.println("Введите направление");
            Scanner scanner = new Scanner(System.in);
            String direction = scanner.nextLine();
            if (direction.equals("u") || direction.equals("d") ||
                direction.equals("l") || direction.equals("r") ||
                direction.equals("U") || direction.equals("D") ||
                direction.equals("L") || direction.equals("R")) {
                    stepCount++;
                    return direction;
            } else {
                System.out.println("Вы ввели неверный символ, допутимые: U, D, L, R");
            }
        }
        //return null;
    }
    // определение структуры данных
    // вывод текущего состояния
    // ввод направления
    // пересчет позиции и состояния
}