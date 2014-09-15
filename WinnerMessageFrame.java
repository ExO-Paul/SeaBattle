package Sokolchik.Paul.SeaBattle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sokolchik_p on 15.09.2014.
 */
public class WinnerMessageFrame {

    public WinnerMessageFrame(boolean win, String username){



        JFrame message= new JFrame("Winner");
        message.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        message.setLocation((dimension.width - message.getWidth()) / 2, (dimension.height - message.getHeight()) / 2);
        JLabel label;
        if (win)
            label= new JLabel("You won, Admiral " + username + "!");
        else
            label= new JLabel("Such a misfortune, " + username + " =(");

        message.setLayout(new GridLayout());

        message.add(label);

        message.pack();

        message.setVisible(true);
        System.out.print("You won, Admiral " + username + "!");
    }
}
