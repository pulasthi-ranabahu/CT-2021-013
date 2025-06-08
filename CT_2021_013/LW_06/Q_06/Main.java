package Q_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pet> pets = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n| Pet Menu |");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Add Cat
                    System.out.print("Enter cat's name: ");
                    String catName = scanner.nextLine();
                    System.out.print("Enter cat's coat color: ");
                    String coatColor = scanner.nextLine();

                    Cat cat = new Cat(catName, coatColor);
                    pets.add(cat);
                    catList.add(cat);
                    System.out.println("Cat added.");
                    break;

                case 2: // Add Dog
                    System.out.print("Enter dog's name: ");
                    String dogName = scanner.nextLine();
                    System.out.print("Enter dog's weight (in kg): ");
                    double weight = scanner.nextDouble();
                    scanner.nextLine();

                    Dog dog = new Dog(dogName, weight);
                    pets.add(dog);
                    dogList.add(dog);
                    System.out.println("Dog added.");
                    break;

                case 3: // Remove Cat
                    System.out.print("Enter the name of the cat to remove: ");
                    String removeCatName = scanner.nextLine();

                    catList.removeIf(c -> c.getName().equalsIgnoreCase(removeCatName));
                    pets.removeIf(p -> p instanceof Cat && p.getName().equalsIgnoreCase(removeCatName));
                    System.out.println("Cat removed...");
                    break;

                case 4: // Remove Dog
                    System.out.print("Enter the name of the dog to remove: ");
                    String removeDogName = scanner.nextLine();

                    dogList.removeIf(d -> d.getName().equalsIgnoreCase(removeDogName));
                    pets.removeIf(p -> p instanceof Dog && p.getName().equalsIgnoreCase(removeDogName));
                    System.out.println("Dog removed...");
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 0–4.");
            }

        } while (choice != 0);

        // List of currently included dogs and cats
        System.out.println("\n| Final Cat List |");
        if (catList.isEmpty()) {
            System.out.println("No cats in the list!");
        } else {
            for (Cat c : catList) {
                System.out.println("Name: " + c.getName() + " -> Coat Color: " + c.getCoatColor());
            }
        }

        System.out.println("\n| Final Dog List |");
        if (dogList.isEmpty()) {
            System.out.println("No dogs in the list!");
        } else {
            for (Dog d : dogList) {
                System.out.println("Name: " + d.getName() + " -> Weight: " + d.getWeight() + " kg");
            }
        }


    }
}


