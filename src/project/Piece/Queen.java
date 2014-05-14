package project.Piece;

import project.Resources.Location;

/**
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class Queen extends Piece {
    public Queen(boolean white, Location location) {
        super(white, location);
    }

    @Override
    public String getSymbol() {
        if (isWhite()) {
            symbol = "wQ";
        } else {
            symbol = "bQ";
        }
        return symbol;
    }
}
