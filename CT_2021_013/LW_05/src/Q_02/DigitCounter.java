package Q_02;
import java.util.Scanner;

public class DigitCounter {
    public static int countDigits(int n) {
        if (n == 0) return 1;
        int count = 0;
        n = Math.abs(n);
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer (negative to quit): ");
            int num = sc.nextInt();
            if (num < 0) break;
            System.out.println("Number of digits: " + countDigits(num));
        }
        sc.close();
    }
}
