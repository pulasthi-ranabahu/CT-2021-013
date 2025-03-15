import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in centimeters: ");
        double cm = scanner.nextDouble();

        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        System.out.println("Equivalent length: " + feet + " feet " + remainingInches + " inches");
        scanner.close();
    }
}
