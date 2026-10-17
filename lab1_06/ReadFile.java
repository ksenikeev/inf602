import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("Labirint.java"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }

    static String clearWord(String word) {
        char c = word.charAt(word.length() - 1);
        switch (c) {
            case '.': case ',': case '!': case ':':
            case '?': case ';':
                word = word.substring(0, word.length() - 1);
        }
        return word;
    }
}
// считать файл
// определить кол-во символов
// максимальную длину строки
// кол-во слов (по пробелу)
// подсчитать кол-во вхождений каждого слова
/*

String[] words = new String[5000]; //храним только в нижнем регистре
int[] counts = new int[5000];
int count = -1;

int findWord(String word);
String clearWord(String word) // .,:!?
 */