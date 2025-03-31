package Q_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the outer radius (ro): ");
        double ro = scanner.nextDouble();
        System.out.print("Enter the inner radius (ri): ");
        double ri = scanner.nextDouble();
        Circle outer = new Circle(ro);
        Circle inner = new Circle(ri);
        double regionArea = outer.computeArea() - inner.computeArea();
        System.out.println("Area of the circular region: " + regionArea);
    }
}