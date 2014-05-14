package project.Piece;

import project.Resources.*;
import java.util.Vector;

/**
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class Pawn extends Piece {
    private final Vector<Location> movement = new Vector<Location>(0, 1);

    public Pawn(boolean white, Location location) {
        super(white, location);
    }

    public void setMovement() {
        /*
        Adds locations to the movement vector. The Pawn will only be able to move to locations in the vector.
         */
        int x = getLocation().getX();
        int y = getLocation().getY();
        Location move1 = new Location(x, y+1);
        movement.add(move1);


    }

    @Override
    public String getSymbol() {
        if (isWhite()) {
            symbol = "wP";
        } else {
            symbol = "bP";
        }
        return symbol;
    }
}
