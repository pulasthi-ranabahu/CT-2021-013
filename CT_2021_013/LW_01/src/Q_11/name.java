package Q_11;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (first middle last): ");
        String fullName = scanner.nextLine().trim();

        String[] nameParts = fullName.split("\\s+");

        if (nameParts.length !=3){
            System.out.println("Invalid input format. Please use : first middle last");
            return;
        }

        String firstName = nameParts[0];
        String middleName = nameParts[1];
        String lastName = nameParts[2];

        String formattedName = lastName + " ,"+ firstName + " "+ middleName.charAt(0) + ".";
        System.out.println("Formatted name: "+ formattedName);
    }
}
