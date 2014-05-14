package project.Piece;

import project.Resources.Location;

/**
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 * Date: 5/13/2014
 * Time: 9:42 AM
 */
public class Bishop extends Piece {
    public Bishop(boolean white, Location location) {
        super(white, location);
    }

    @Override
    public String getSymbol() {
        if (isWhite()) {
            symbol = "wB";
        } else {
            symbol = "bB";
        }
        return symbol;
    }
}
