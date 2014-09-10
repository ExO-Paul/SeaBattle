package Sokolchik.Paul.SeaBattle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sokolchik_p on 10.09.2014.
 */
public class FieldPanel extends JPanel {

    public FieldPanel(int size){
        super();
        this.setSize(size, size);

        this.setOpaque(true);
        this.setBackground(new Color(166, 180, 255));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;


        int gridSize = this.getHeight()-20;
        for (int i = 0; i<11; i++) {
            g2d.drawLine(this.getX() + 5 + ((gridSize - 10) * i / 10), this.getY(), this.getX() + 5 + ((gridSize - 10) * i / 10), gridSize+12);
            g2d.drawLine(this.getX() + 5 , this.getY()+ ((gridSize - 10) * i / 10), gridSize - 5 , this.getY() + ((gridSize - 10) * i / 10));
        }
    }
}
