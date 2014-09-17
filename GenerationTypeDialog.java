package Sokolchik.Paul.SeaBattle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by sokolchik_p on 15.09.2014.
 */
public class GenerationTypeDialog {


    public GenerationTypeDialog(final GamePanel gamePanel) {

        final JDialog message = new JDialog();
        message.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        message.setLocation((dimension.width - message.getWidth()) / 2, (dimension.height - message.getHeight()) / 2);
        JLabel label = new JLabel("Please, choose who you want to place your ships");

        JButton youBtn = new JButton("You");

        youBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.isAuto = false;
                message.dispose();
            }
        });

        JButton aideBtn = new JButton("Your aide");

        aideBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.isAuto = true;
                message.dispose();
            }
        });


        message.add(label, BorderLayout.BEFORE_FIRST_LINE);
        message.add(youBtn, BorderLayout.LINE_START);
        message.add(aideBtn, BorderLayout.LINE_END);


        message.pack();

        message.setVisible(true);
    }
}
