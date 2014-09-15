package Sokolchik.Paul.SeaBattle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sokolchik_p on 10.09.2014.
 */
public class GamePanel extends JPanel {

    Player player, ai;
    public boolean isAuto = true;

    public GamePanel(){

        this.setSize(MainFrame.WIDTH, MainFrame.HEIGHT-150);
        this.setBackground(new Color(79, 140, 202));

        player= new Player(true);                                       //Создаём нового игрока-человека
        ai = new Player(false);                                         //Создаём игрока - AI
        //GenerationTypeDialog choiceFrame = new GenerationTypeDialog(this);

        JOptionPane.showInternalOptionDialog(this, "")


        player.createField(isAuto);
        ai.createField(true);

        FieldPanel field = new FieldPanel(this.getMinimumSize(), this, player.getField(), player, ai);

        field.setBackground(new Color(52, 92, 130));

        field.addMouseListener(new MouseShipPlaceAdapter(this, field, player));

        FieldPanel map = new FieldPanel(this.getMinimumSize(),this, player.getMap(), player, ai);

        map.addMouseListener(new MouseShootAdapter(this, map, player, ai));

        this.setLayout(new GridLayout());
        //new BoxLayout(this, BoxLayout.X_AXIS);
        this.add(field);
        this.add(map);

    }
}
