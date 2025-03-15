import java.util.Scanner;
public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (1.8 * celsius) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        scanner.close();
    }
}
