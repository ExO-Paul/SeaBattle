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
        MainFrame frame = new MainFrame();
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


    static void winner(boolean win, String username, Container frame) {
        if (win)
            JOptionPane.showMessageDialog(frame, "You won, Admiral " + username + "!");
        else
            JOptionPane.showMessageDialog(frame, "Such a misfortune, " + username + " =(");
        //WinnerMessageFrame frame = new WinnerMessageFrame (win, username);

    }

    static void wrongCoordinate() {
        System.out.println("Would you kindly set valid coordinates, sir?");
    }

    static void gotHim() {
        System.out.println("You got him!");
    }

    static void shipsReady() {
        System.out.println("Your ships are ready");
    }

    static void wrongPosition() {
        System.out.println("Please, repeat enter");
    }

    static void shipSunk() {
        System.out.println("The ship is sunk");
    }

    /*public static Coordinate coordinateChoice(){
        return new Coordinate(x,y);

    }*/

   /* public static Ship.Direction directionChoice(){

        return
    }*/

}
