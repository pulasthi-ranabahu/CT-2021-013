package Q_07;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class liveClock {
    public static void main(String[]args){
        SwingUtilities.invokeLater(() ->{
            JFrame frame = new JFrame();
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

            Timer timer = new Timer(1000, e ->{
                LocalTime currentTime = LocalTime.now();
                frame.setTitle(currentTime.format(formatter));
            });
            timer.start();
            frame.setVisible(true);
        });

    }

}
