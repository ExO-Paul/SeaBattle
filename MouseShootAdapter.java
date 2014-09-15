package Sokolchik.Paul.SeaBattle;

import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by sokolchik_p on 11.09.2014.
 */
public class MouseShootAdapter implements MouseListener{

    FieldPanel field;
    GamePanel gamePanel;
    Player player, ai;

    public MouseShootAdapter(GamePanel gamePanel, FieldPanel field, Player player, Player ai){
        this.gamePanel = gamePanel;
        this.field=field;
        this.player = player;
        this.ai = ai;
    }

    public void mouseClicked(MouseEvent e){
        int xIndex = (int)Math.ceil(e.getX()/field.cellSize);
        int yIndex = (int)Math.ceil(e.getY()/field.cellSize);

        GUI.winner(true, player.username, gamePanel.getParent());

        gamePanel.repaint();

    }

    public void mousePressed(MouseEvent e){}

    public void mouseReleased(MouseEvent e){}

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}


}
