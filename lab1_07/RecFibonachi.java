public class RecFibonachi {
    public static void main(String[] args) {
        int[] a = new int[20];
        fillArrayByFib(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(fibonachi(12));

    }
    public static void fillArrayByFib(int[] a) {
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i-1] + a[i-2];
        }
    }
    public static int fibonachi (int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonachi(n-1) + fibonachi(n-2);
    }
}