package project.Piece;

import project.Board.Board;
import project.Resources.Location;

/**
 * A simple class to represent the knight chess piece and determine possible movement for it.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class Knight extends Piece {
    /**
     * Simply uses the constructor inherited from Piece.
     * @param white A boolean that determines the color of the Pawn.
     * @param location A Location object that determines the location of the Pawn on the Board.
     * @see project.Piece.Piece
     * @see project.Resources.Location
     */
    public Knight(boolean white, Location location) {
        super(white, location);
    }

    @Override
    public void setMovement(Board board) {
        int x = getLocation().getX();
        int y = getLocation().getY();

        if (y < 6 && x > 0) {
            movement.add(new Location(x - 1, y + 2));
        }

        if (y < 6 && x < 7) {
            movement.add(new Location(x + 1, y + 2));
        }

        if (y > 1 && x > 0) {
            movement.add(new Location(x - 1, y - 2));
        }

        if (y > 1 && x < 7) {
            movement.add(new Location(x + 1, y - 2));
        }

        if (y < 7 && x > 1) {
            movement.add(new Location(x - 2, y + 1));
        }

        if (y < 7 && x < 6) {
            movement.add(new Location(x + 2, y + 1));
        }

        if (y > 0 && x > 1) {
            movement.add(new Location(x - 2, y - 1));
        }

        if (y > 0 && x < 6) {
            movement.add(new Location(x + 2, y - 1));
        }
    }

    /**
     * Returns the symbol to be used for the Pawn to be used by the CLI Class. This overrides the method in the Piece
     * Class because a Knight has a more specific symbol.
     * @return A String that contains the 'symbol' for the Knight.
     */
    @Override
    public String getSymbol() {
        if (isWhite()) {
            symbol = "wKn";
        } else {
            symbol = "bKn";
        }
        return symbol;
    }
}
