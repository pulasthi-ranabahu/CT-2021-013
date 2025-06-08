package Q_05;

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
                System.out.print("Enter your cat's coat color: ");
                String coatColor = scanner.nextLine();
                pets.add(new Cat(name, coatColor));
            } else if (type == 'd' || type == 'D') {
                System.out.print("Enter your dog's weight (in kg): ");
                double weight = scanner.nextDouble();
                scanner.nextLine();
                pets.add(new Dog(name, weight));
            } else {
                pets.add(new Pet(name)); // Unknown
            }

        }
        List<Dog> dogList = new ArrayList<>();

        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                dogList.add((Dog) pet);
            }
        }

        System.out.println("\n| Cat List |");
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                Cat cat = (Cat) pet;
                System.out.println("Name: " + cat.getName() + " -> Type: Cat -> Coat Color: " + cat.getCoatColor());
            }
        }

        System.out.println("\n| Dog List |");
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                Dog dog = (Dog) pet;
                System.out.println("Name: " + dog.getName() + " -> Type: Dog -> Weight: " + dog.getWeight() + " kg");
            }
        }
        if (!dogList.isEmpty()) {
            double totalWeight = 0;
            double minWeight = dogList.get(0).getWeight();
            double maxWeight = dogList.get(0).getWeight();

            for (Dog dog : dogList) {
                double weight = dog.getWeight();
                totalWeight += weight;

                if (weight < minWeight) {
                    minWeight = weight;
                }

                if (weight > maxWeight) {
                    maxWeight = weight;
                }
            }

            double averageWeight = totalWeight / dogList.size();

            System.out.println("\n| Dog Weight Stats |");
            System.out.println("Average Weight: " + averageWeight + " kg.");
            System.out.println("Minimum Weight: " + minWeight + " kg.");
            System.out.println("Maximum Weight: " + maxWeight + " kg.");
        } else {
            System.out.println("\nNo dogs were entered to calculate weight statistics.");
        }



    }

}


