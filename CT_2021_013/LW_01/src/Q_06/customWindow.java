package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class customWindow {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter window width (W): ");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter window height (H): ");
        int height = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter window title: ");
        String title = scanner.nextLine();

        JFrame frame = new JFrame(title);
        frame.setSize(width , height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        scanner.close();

    }
}
