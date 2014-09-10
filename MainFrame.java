package Sokolchik.Paul.SeaBattle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by sokolchik_p on 10.09.2014.
 */
public class MainFrame extends JFrame {

    public MainFrame (){

        super("SeaBattle");

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dimension.width / 2, dimension.height / 2);
        this.setLocation((dimension.width - this.getWidth()) / 2, (dimension.height - this.getHeight()) / 2);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu gameMenu = new JMenu("Game");

        JMenuItem startMenuItem = new JMenuItem("Start");
        startMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeaBattle.game();
            }
        });
        gameMenu.add(startMenuItem);


        JMenuItem restartMenuItem = new JMenuItem("Restart");
        restartMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Input.stdIn.reset();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                /*SeaBattle.game();*/
                SeaBattle.main(null);

            }
        });
        gameMenu.add(restartMenuItem);

        JMenuItem quitMenuItem = new JMenuItem("Quit");
        quitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        gameMenu.add(quitMenuItem);

        menuBar.add(gameMenu);


        JMenu helpMenu = new JMenu("Help");

        JMenuItem howMenuItem = new JMenuItem("How to play");
        howMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        helpMenu.add(howMenuItem);

        menuBar.add(helpMenu);

        /*this.setLayout( new BorderLayout());*/

        this.add(menuBar, BorderLayout.NORTH);

        GamePanel gamePanel = new GamePanel();

        this.add(gamePanel, BorderLayout.CENTER);

        /*FieldPanel field = new FieldPanel(this.getHeight()*2/3);
        this.add(field, BorderLayout.CENTER);*/

        this.setVisible(true);


    }
}
