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
    static int stepCount = 0;

    public static void main(String[] args) {
        showStatus();

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
                    direction.equals("l") || direction.equals("r")) ||
            direction.equals("U") || direction.equals("D") ||
                    direction.equals("L") || direction.equals("R")) {
                    stepCount++;
                    return direction;
            } else {
                System.out.println("Вы ввели неверный символ, допутимые: U, D, L, R");
            }
        }
        return null;
    }
    // определение структуры данных
    // вывод текущего состояния
    // ввод направления
    // пересчет позиции и состояния
}