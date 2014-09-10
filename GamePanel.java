package Sokolchik.Paul.SeaBattle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sokolchik_p on 10.09.2014.
 */
public class GamePanel extends JPanel {

    public GamePanel(){

//        this.setSize(MainFrame.WIDTH, MainFrame.HEIGHT-150);
        this.setBackground(new Color(79, 140, 202));

        FieldPanel field = new FieldPanel(this.getHeight()*2/3);

        FieldPanel map = new FieldPanel(this.getHeight()*2/3);

        this.setLayout(new BorderLayout());
        //this.add(field, BorderLayout.WEST);
        this.add(map, BorderLayout.EAST);

    }
}
