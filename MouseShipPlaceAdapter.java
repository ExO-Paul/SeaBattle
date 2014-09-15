package Sokolchik.Paul.SeaBattle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by sokolchik_p on 11.09.2014.
 */
public class MouseShipPlaceAdapter implements MouseListener{

    FieldPanel field;
    GamePanel gamePanel;
    Player player, ai;

    public MouseShipPlaceAdapter(GamePanel gamePanel, FieldPanel field, Player player){
        this.gamePanel = gamePanel;
        this.field=field;
        this.player = player;

    }

    public void mouseClicked(MouseEvent e){
        if (gamePanel.isAuto) {
            int xIndex = (int) Math.ceil(e.getX() / field.cellSize);
            int yIndex = (int) Math.ceil(e.getY() / field.cellSize);


            gamePanel.repaint();
        }
    }

    public void mousePressed(MouseEvent e){}

    public void mouseReleased(MouseEvent e){}

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}


}
