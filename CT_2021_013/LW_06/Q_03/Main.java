package Q_03;

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
                pets.add(new Pet(name));
            }
        }

        System.out.println("\n| Cat List |");
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                System.out.println("Name: " + pet.getName());
            }
        }

        System.out.println("\n| Dog List |");
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                System.out.println("Name: " + pet.getName());
            }
        }

        System.out.println("\n| Unknown Type List |");
        for (Pet pet : pets) {
            if (!(pet instanceof Cat) && !(pet instanceof Dog)) {
                System.out.println("Name: " + pet.getName());
            }
        }

    }

}


