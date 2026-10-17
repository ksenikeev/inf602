public class Exponenta {
    public static void main(String[] args) {
        System.out.println(exp(1));
    }
    public static double exp(double x) {
        double e = 1 + x;
        double epsilon = 1e-6;
        double s = x;
        int n = 2;
        while ((s > epsilon) || (s < -epsilon)) {
            s = s * x / n++;
            e = e + s;
        }
        return e;
    }
}