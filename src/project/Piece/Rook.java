package project.Piece;

import project.Board.Board;
import project.Resources.Location;

/**
 * A simple class to represent the rook chess piece and determine possible movements for it.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class Rook extends Piece {
    /**
     * Simply uses the constructor inherited from Piece.
     * @param white A boolean that determines the color of the Rook.
     * @param location A Location object that determines the location of the Pawn on the Board.
     * @see project.Piece.Piece
     * @see project.Resources.Location
     */
    public Rook(boolean white, Location location) {
        super(white, location);
    }

    @Override
    public void setMovement(Board board) {
        int x = getLocation().getX();
        int y = getLocation().getY();

        while (x > 0 && board.getCell(new Location(x-1, y)) == null) {
            movement.add(new Location(x-1, y));
            x--;
        }

        if (x > 0) {
            movement.add(new Location(x-1, y));
        }

        x = getLocation().getX();
        y = getLocation().getY();

        while (x < 7 && board.getCell(new Location(x+1, y)) == null) {
            movement.add(new Location(x+1, y));
            x++;
        }

        if (x < 7) {
            movement.add(new Location(x+1, y));
        }

        x = getLocation().getX();
        y = getLocation().getY();

        while (y > 0 && board.getCell(new Location(x, y-1)) == null) {
            movement.add(new Location(x, y-1));
            y--;
        }

        if (y > 0) {
            movement.add(new Location(x, y-1));
        }

        x = getLocation().getX();
        y = getLocation().getY();

        while (y < 7 && board.getCell(new Location(x, y+1)) == null) {
            movement.add(new Location(x, y+1));
            y++;
        }

        if (y < 7) {
            movement.add(new Location(x, y+1));
        }
    }

    /**
     * Returns the symbol to be used for the Pawn to be used by the CLI Class. This overrides the method in
     * the Piece Class because a Rook has a more specific symbol.
     * @return A String that contains the 'symbol' for the Rook.
     */
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
