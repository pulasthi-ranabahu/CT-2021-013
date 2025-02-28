package Q_10;

import java.util.Scanner;

public class oddChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter an odd lenght word: ");
        String word = scanner.next();

        int middleIndex = word.length() /2;
        char middleChar = word.charAt(middleIndex);

        System.out.println("Middle charcter: "+ middleChar);
    }
}
