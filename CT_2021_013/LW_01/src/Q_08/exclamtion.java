package Q_08;

import java.util.Scanner;

public class exclamtion {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a string containing exactly one '!':");
        String input = scanner.nextLine();

        String[] parts = input.split("!");

        String before = parts[0].trim();
        String after = parts[1].trim();

        System.out.println("\nBefore exclamtion: ");
        System.out.println(before);
        System.out.println("\nAfter exclamation");
        System.out.println(after);

    }
}
