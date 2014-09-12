package Sokolchik.Paul.SeaBattle;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;

/**
 * Created by sokolchik_p on 10.09.2014.
 */
public class GamePanel extends JPanel {

    Player player, ai;

    public GamePanel(){

        this.setSize(MainFrame.WIDTH, MainFrame.HEIGHT-150);
        this.setBackground(new Color(79, 140, 202));

        player= new Player(true);                                       //Создаём нового игрока-человека
        ai = new Player(false);                                         //Создаём игрока - AI
        player.createField(/*Input.genTypeChoice()*/true);                      //СДЕЛАТЬ ФОРМУ ЗАПРОСА
        ai.createField(true);

        FieldPanel field = new FieldPanel(this.getMinimumSize(), this, player.getField(), player, ai);

        field.setBackground(new Color(52, 92, 130));

        FieldPanel map = new FieldPanel(this.getMinimumSize(),this, player.getMap(), player, ai);

        this.setLayout(new GridLayout());
        //new BoxLayout(this, BoxLayout.X_AXIS);
        this.add(field);
        this.add(map);

    }
}
