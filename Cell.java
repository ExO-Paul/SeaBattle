package Sokolchik.Paul.SeaBattle;

/**
 * Created by ExO on 21.08.2014.
 */
public class Cell {
    boolean occupied;
    boolean wasShot;
    boolean wasMarked;


    public Cell() {
    }

    public Cell(boolean occupied, boolean wasShot) {
        this.occupied = occupied;
        this.wasShot = wasShot;


    }

}
