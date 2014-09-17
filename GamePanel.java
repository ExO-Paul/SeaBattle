package Sokolchik.Paul.SeaBattle;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;

/**
 * Created by sokolchik_p on 10.09.2014.
 */
public class GamePanel extends JPanel {

    Player player, ai;
    public boolean isAuto = true;
    boolean settingShips;

    public GamePanel() {

        this.setSize(MainFrame.WIDTH, MainFrame.HEIGHT - 150);
        this.setBackground(new Color(79, 140, 202));

        player = new Player(true);                                       //Создаём нового игрока-человека
        ai = new Player(false);                                         //Создаём игрока - AI

        Object[] options = {"Your aide", "You"};
        if (JOptionPane.showOptionDialog(this.getParent(), "Who should place your ships?", "Please, choose",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == 1)
            isAuto = false;


        player.createField(/*isAuto*/true);
        if (!isAuto) {
            settingShips = true;

        }

        ai.createField(true);

        FieldPanel field = new FieldPanel(this.getMinimumSize(), this, player.getField(), player, ai);

        field.setBackground(new Color(52, 92, 130));


        field.addMouseListener(new MouseShipPlaceAdapter(this, field, player));

        FieldPanel map = new FieldPanel(this.getMinimumSize(), this, player.getMap(), player, ai);

        map.addMouseListener(new MouseShootAdapter(this, map, player, ai));


        this.setLayout(new GridLayout());
        //new BoxLayout(this, BoxLayout.X_AXIS);
        this.add(field);
        this.add(map);
    }
}
