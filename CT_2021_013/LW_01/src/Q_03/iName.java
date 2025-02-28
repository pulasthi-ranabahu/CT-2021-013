package Q_03;

import java.util.Scanner;

public class iName {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        String formattedName = firstName + " " + middleName.charAt(0)+"." + lastName;

        System.out.println("\nFormatted Name: "+ formattedName);
    }
}

