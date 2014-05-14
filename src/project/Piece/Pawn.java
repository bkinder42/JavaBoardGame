package project.Piece;

import project.Resources.*;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Ben
 * @version 1.0
 * @since 5/13/2014
 * Date: 5/13/2014
 * Time: 9:41 AM
 */
public class Pawn extends Piece {
    private Vector<Location> movement = new Vector<Location>(0, 1);

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
}
