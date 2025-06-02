package Q_01;
import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third integer: ");
        int n3 = sc.nextInt();

        int smallest;
        if (n1 <= n2 && n1 <= n3) {
            smallest = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            smallest = n2;
        } else {
            smallest = n3;
        }
        System.out.println("Smallest number is: " + smallest);
        sc.close();
    }
}
