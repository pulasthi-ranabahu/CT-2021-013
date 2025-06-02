package Q_05;
import java.util.Scanner;

public class BurgerMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrees = {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"};
        double[] entreePrices = {3.49, 4.59, 3.99, 2.99};

        String[] sides = {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"};
        double[] sidePrices = {0.79, 0.69, 1.09, 0.59};

        String[] drinks = {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
        double[] drinkPrices = {1.99, 1.90, 2.49, 0.99};

        System.out.println("Entree Menu:");
        for (int i = 0; i < entrees.length; i++) {
            System.out.printf("%d. %s ($%.2f)%n", i+1, entrees[i], entreePrices[i]);
        }
        System.out.print("Select an entree (1-4): ");
        int entreeChoice = sc.nextInt() - 1;

        System.out.println("\nSide Dish Menu:");
        for (int i = 0; i < sides.length; i++) {
            System.out.printf("%d. %s ($%.2f)%n", i+1, sides[i], sidePrices[i]);
        }
        System.out.print("Select a side dish (1-4): ");
        int sideChoice = sc.nextInt() - 1;

        System.out.println("\nDrink Menu:");
        for (int i = 0; i < drinks.length; i++) {
            System.out.printf("%d. %s ($%.2f)%n", i+1, drinks[i], drinkPrices[i]);
        }
        System.out.print("Select a drink (1-4): ");
        int drinkChoice = sc.nextInt() - 1;

        double total = entreePrices[entreeChoice] + sidePrices[sideChoice] + drinkPrices[drinkChoice];

        System.out.println("\nYour Order:");
        System.out.printf("Entree: %s ($%.2f)%n", entrees[entreeChoice], entreePrices[entreeChoice]);
        System.out.printf("Side: %s ($%.2f)%n", sides[sideChoice], sidePrices[sideChoice]);
        System.out.printf("Drink: %s ($%.2f)%n", drinks[drinkChoice], drinkPrices[drinkChoice]);
        System.out.printf("Total: $%.2f%n", total);

        sc.close();
    }
}
