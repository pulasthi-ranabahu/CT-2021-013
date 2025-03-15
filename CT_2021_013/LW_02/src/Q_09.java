import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount (P): ");
        double P = scanner.nextDouble();
        System.out.print("Enter annual interest rate (R) in percent: ");
        double R = scanner.nextDouble();
        System.out.print("Enter number of years (N): ");
        int N = scanner.nextInt();

        double amount = P * Math.pow(1 + (R / 100), N);
        System.out.println("Total amount after " + N + " years: " + amount);
        scanner.close();
    }
}
