package Q_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        Temperature temp = new Temperature(celsius);
        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit());
    }
}