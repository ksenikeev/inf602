public class StrigSort {
    public static void main(String[] args) {
        // a - 1072, я - 1103, ё - 1105
        String[] array = {"Чернов", "Синяк", "Еникеева", "Юмакаев", "Еникеев"};
        sort(array);
        for(String el: array)
            System.out.println(el);

    }

    public static void printChar(char i) {
        System.out.println(i + " " + (int) i);
    }



    public static int compare(char a, char b) {
        if (a == 'ё' && b == 'ё')
            return 0;

        if (a != 'ё'  &&  b != 'ё') {
            return a - b;
        }

        if (a == 'ё') {
            if (b < 'ж')
                return 1;
            else
                return -1;
        }

        if (b == 'ё') {
            if (a < 'ж')
                return -1;
            else
                return 1;
        }

        return 0;
    }
    public static int compareString(String a, String b) {
        int minLen = a.length() < b.length() ? a.length() : b.length();
        for(int i = 0; i < minLen; i++) {
            int comp = compare(a.charAt(i), b.charAt(i));

            if (comp != 0)
                return comp;
        }
        return a.length() - b.length();
    }

    public static void sort(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if (compareString(arr[j].toLowerCase(), arr[j+1].toLowerCase()) > 0) {
                    String cur = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = cur;
                }
            }

        }
    }
}