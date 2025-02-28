package Q_02;

import javax.swing.*;

public class fistlastName {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Enter first name: ");
        String lastName = JOptionPane.showInputDialog("Enter last name: ");

        JFrame frame = new JFrame(firstName + " " + lastName);
        frame.setSize(800 , 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
