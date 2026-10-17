public class Sinus {
    public static void main(String[] args) {
        System.out.println(sin(3.1415 / 2));
    }

    public static double sin(double x) {
        double epsilon = 1e-6;
        double s = x;
        double reg = x;
        int n = 2;
        int sign = -1;
        while((epsilon < reg) || (reg < - epsilon)) {
            reg = reg * x * x / (n * (n + 1));
            s += reg * sign;
            sign = -sign;
            n = n + 2;
        }
        return s;
    }

    int find(int[] array, int x) {
        return -1;
    }
}