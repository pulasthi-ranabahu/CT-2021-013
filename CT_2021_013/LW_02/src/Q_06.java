import java.util.Scanner;
import java.time.Year;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");
        scanner.close();
    }
}
