package project.Piece;

import project.Board.Board;
import project.Resources.Location;

/**
 * A simple class to represent the bishop chess piece and determine possible movements for it.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class Bishop extends Piece {
    /**
     * Simply uses the constructor inherited from Piece.
     * @param white A boolean that determines the color of the Bishop.
     * @param location A Location object that determines the location of the Pawn on the Board.
     * @see project.Piece.Piece
     * @see project.Resources.Location
     */
    public Bishop(boolean white, Location location) {
        super(white, location);
    }

    @Override
    public void setMovement(Board board) {
        int x = getLocation().getX();
        int y = getLocation().getY();

        movement.setSize(0);
        movement.trimToSize();

        while (x < 7 && y < 7 && board.getCell(new Location(x+1, y+1)) == null) {
            movement.add(new Location(x+1, y+1));
            x++;
            y++;
        }

        if (x < 7 && y < 7 && ((board.getCell(new Location(x+1, y+1)) != null && board.getCell(new Location(x+1, y+1)).isWhite() != isWhite()) || board.getCell(new Location(x+1, y+1)) == null)) {
            movement.add(new Location(x+1, y+1));
        }

        x = getLocation().getX();
        y = getLocation().getY();

        while (x > 0 && y > 0 && board.getCell(new Location(x-1, y-1)) == null) {
            movement.add(new Location(x-1, y-1));
            x--;
            y--;
        }

        if (x > 0 && y > 0 && ((board.getCell(new Location(x-1, y-1)) != null && board.getCell(new Location(x-1, y-1)).isWhite() != isWhite()) || board.getCell(new Location(x-1, y-1)) == null)) {
            movement.add(new Location(x-1, y-1));
        }
    }

    /**
     * Returns the symbol to be used for the Pawn to be used by the CLI Class. This overrides the method in
     * the Piece Class because a Bishop has a more specific symbol.
     * @return A String that contains the 'symbol' for the Bishop.
     */
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
