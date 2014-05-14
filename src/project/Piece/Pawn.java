package project.Piece;

import project.Resources.*;
import java.util.Vector;

/**
 * A simple class to represent the pawn chess piece and determine possible movement for that piece.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class Pawn extends Piece {
    /**
     * A vector that will contain all of the places on the Board that the Pawn can move. These places are stored in Location objects.
     * @see project.Resources.Location
     */
    private final Vector<Location> movement = new Vector<Location>(0, 1);

    /**
     * Simply uses the constructor inherited from Piece.
     * @param white A boolean that determines the color of the Pawn.
     * @param location A Location object that determines the location of the Pawn on the Board.
     * @see project.Piece.Piece
     * @see project.Resources.Location
     */
    public Pawn(boolean white, Location location) {
        super(white, location);
    }

    /**
     * Updates the 'movement' Vector adding places that it is possible for the Pawn to move to and removing all other places.
     */
    public void setMovement() {
        int x = getLocation().getX();
        int y = getLocation().getY();
        Location move1 = new Location(x, y+1);
        movement.add(move1);
    }

    /**
     * Returns the symbol to be used for the Pawn to be used by the CLI Class. This overrides the method in the Piece
     * Class because a Pawn has a more specific symbol.
     * @return A String that contains the 'symbol' for the Pawn.
     */
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
