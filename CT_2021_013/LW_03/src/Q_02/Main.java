package Q_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        Temp temp = new Temp();
        temp.setFahrenheit(fahrenheit);
        System.out.println("Temperature in Celsius: " + temp.toCelsius());
    }
}