package Q_09;

import java.util.Scanner;

public class numCharacter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int lenght = input.length();
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(lenght -1);

        System.out.println(lenght);
        System.out.println(firstChar);
        System.out.println(lastChar);

    }
}
