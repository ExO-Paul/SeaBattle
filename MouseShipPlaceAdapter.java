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
    boolean shipRotating;
    Ship newShip;
    int strength;

    public MouseShipPlaceAdapter(GamePanel gamePanel, FieldPanel field, Player player){
        this.gamePanel = gamePanel;
        this.field=field;
        this.player = player;
        strength = 4;

    }

    public void mouseClicked(MouseEvent e){

            int xIndex = (int) Math.ceil(e.getX() / field.cellSize);
            int yIndex = (int) Math.ceil(e.getY() / field.cellSize);
            if (!shipRotating) {
                newShip = new Ship();
                newShip.beginning.x = xIndex;
                newShip.beginning.y = yIndex;
                shipRotating = true;
            }
            else{
                if (xIndex==newShip.beginning.x)
                    if (yIndex>newShip.beginning.y){
                        newShip.end.x = newShip.beginning.x;
                        newShip.end.y = newShip.beginning.y + (strength - 1);
                    }



                strength--;                         //TODO Нужно с этим что-то делать
                shipRotating = false;
            }

            gamePanel.repaint();

    }

    public void mousePressed(MouseEvent e){}

    public void mouseReleased(MouseEvent e){}

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}


}
