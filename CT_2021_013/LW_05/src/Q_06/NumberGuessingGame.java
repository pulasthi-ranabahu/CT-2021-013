package Q_06;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();
            if (guess < target) {
                System.out.println("Higher!");
            } else if (guess > target) {
                System.out.println("Lower!");
            } else {
                System.out.println("Correct! The number was " + target);
            }
        } while (guess != target);
        sc.close();
    }
}
