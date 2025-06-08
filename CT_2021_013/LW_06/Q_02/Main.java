package Q_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Pet> pets = new ArrayList<>();

        while (true) {
            System.out.print("Enter your pet's name (type 'STOP' to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter your pet's type (c for Cat, d for Dog): ");
            char type = scanner.next().charAt(0);
            scanner.nextLine();

            if (type == 'c' || type == 'C') {
                pets.add(new Cat(name));
            } else if (type == 'd' || type == 'D') {
                pets.add(new Dog(name));
            } else {
                pets.add(new Pet(name)); // Unknown type
            }
        }

        System.out.println("\n| Pet List |");
        for (Pet pet : pets) {
            System.out.println("Name: " + pet.getName() + " -> Type: " + pet.getType());
        }
    }
}
