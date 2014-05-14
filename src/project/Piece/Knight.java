package project.Piece;

import project.Resources.Location;

/**
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 * Date: 5/13/2014
 * Time: 9:41 AM
 */
public class Knight extends Piece {
    public Knight(boolean white, Location location) {
        super(white, location);
    }

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
