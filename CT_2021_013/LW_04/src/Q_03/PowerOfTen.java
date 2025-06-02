package Q_03;
import java.util.Scanner;

public class PowerOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a power of 10 (e.g., 6, 9, 12, 15, 18, 21, 30, 100): ");
        int power = sc.nextInt();
        String name;
        switch (power) {
            case 6: name = "Million"; break;
            case 9: name = "Billion"; break;
            case 12: name = "Trillion"; break;
            case 15: name = "Quadrillion"; break;
            case 18: name = "Quintillion"; break;
            case 21: name = "Sextillion"; break;
            case 30: name = "Nonillion"; break;
            case 100: name = "Googol"; break;
            default: name = "No corresponding word for this power of 10";
        }
        System.out.println(name);
        sc.close();
    }
}
