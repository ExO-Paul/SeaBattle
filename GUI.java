package Sokolchik.Paul.SeaBattle;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;

/**
 * Created by sokolchik_p on 25.08.2014.
 */
public class GUI {

    public static void drawFrame() {

        JFrame frame = new JFrame("SeaBattle");

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dimension.width/2,dimension.height/2);
        frame.setLocation((dimension.width-frame.getWidth())/2, (dimension.height-frame.getHeight())/2);

        JMenuBar menuBar = new JMenuBar();

        JMenu gameMenu = new JMenu("Game");

        JMenuItem restartMenuItem = new JMenuItem("Restart");
        restartMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Player player = new Player(true);
                Player ai = new Player(false);
                player.createField(Input.genTypeChoice());
                ai.createField(true);
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

        frame.setJMenuBar(menuBar);





        frame.setVisible(true);
    }


    /**
     * Функция отрисовки поля.
     * Сначала выводит 2 верхние строки, содержащие подписи для горизонтальной оси, затем в каждой следующей строке выводит
     * её номер, начиная с 0, пробел и вертикальную черту для создания разделителя, а после неё - символы в зависимости от числа,
     * содержащегося в очередной ячейке матрицы. В конце строки выводится символ перехода на новую строку.
     */


    static void showMap(Field field) {
        System.out.println("  |0 1 2 3 4 5 6 7 8 9\n--+-------------------");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < 10; j++) {
                if (field.getCell(j, i).occupied) {
                    if (field.getCell(j, i).wasShot)
                        System.out.print("X ");
                    else
                        System.out.print("O ");
                } else if (field.getCell(j, i).wasShot)
                    System.out.print("* ");
                else
                    System.out.print("~ ");
            }
            System.out.println();
        }
    }

    static void winner(boolean win, String username) {
        if (win)
            System.out.print("You won, Admiral " + username + "!");
        else
            System.out.print("Such a misfortune, " + username + " =(");
    }

    static void wrongCoordinate(){
        System.out.println("Would you kindly set valid coordinates, sir?");
    }

    static void gotHim(){
        System.out.println("You got him!");
    }

    static void shipsReady(){
        System.out.println("Your ships are ready");
    }

    static void wrongPosition(){
        System.out.println("Please, repeat enter");
    }

    static void shipSunk(){
        System.out.println("The ship is sunk");
    }

    /*public static Coordinate coordinateChoice(){
        return new Coordinate(x,y);

    }*/

   /* public static Ship.Direction directionChoice(){

        return
    }*/

}
