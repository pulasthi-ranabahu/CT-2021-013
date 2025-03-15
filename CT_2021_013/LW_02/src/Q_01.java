public class Q_01 {
    public static void main(String[] args) {
        double A = 2, B = 3, C = 4, X = 5, Y = 6, r = 7;

        double resultA = Math.sqrt(B * B + 4 * A * C);
        double resultB = Math.sqrt(X + 4 * Math.pow(Y, 3));
        double resultC = Math.cbrt(X * Y);
        double resultD = Math.PI * r * r;

        System.out.println("Result A: " + resultA);
        System.out.println("Result B: " + resultB);
        System.out.println("Result C: " + resultC);
        System.out.println("Result D: " + resultD);
    }
}
