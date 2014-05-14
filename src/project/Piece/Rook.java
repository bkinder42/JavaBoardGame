package project.Piece;

import project.Resources.Location;

/**
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 * Date: 5/13/2014
 * Time: 9:41 AM
 */
public class Rook extends Piece {
    public Rook(boolean white, Location location) {
        super(white, location);
    }

    @Override
    public String getSymbol() {
        if (isWhite()) {
            symbol = "wR";
        } else {
            symbol = "bR";
        }
        return symbol;
    }
}
