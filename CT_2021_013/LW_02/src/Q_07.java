import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        int weight = scanner.nextInt();
        System.out.print("Enter height in centimeters: ");
        int height = scanner.nextInt();

        double bmi = weight / Math.pow(height / 100.0, 2);
        System.out.println("Your BMI is: " + bmi);
        scanner.close();
    }
}
