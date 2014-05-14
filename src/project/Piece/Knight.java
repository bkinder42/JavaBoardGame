package project.Piece;

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
