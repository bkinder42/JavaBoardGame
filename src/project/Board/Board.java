package project.Board;

import project.Piece.*;
import project.Resources.Location;

/**
 * A class to manage the board, add and remove pieces.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class Board {
    private final Object[][] board = new Object[8][8];




    public Board() {
    }

    public void addToBoard(Piece piece) {
        int x = piece.getLocation().getX();
        int y = piece.getLocation().getY();
        board[x][y] = piece;
    }

    public void removeFromBoard(Piece piece) {
        int x = piece.getLocation().getX();
        int y = piece.getLocation().getY();

        board[x][y] = null;
    }

    public void moveOnBoard(Piece piece, Location location) {
        if (board[location.getX()][location.getY()] != null) {
            ((Piece)(getCell(location))).setOut(true);
            board[location.getX()][location.getY()] = null;
        }
        removeFromBoard(piece);
        piece.setLocation(location);
        addToBoard(piece);
    }

    /**
     * Removed all pieces from the board and sets up the board for the beginning of a chess game (adds pieces in the proper places)
     */
    @SuppressWarnings("WeakerAccess")
    public void init() {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                board[j][i] = null;
            }
        }
    }

    /**
     * Returns the object at the location specified in the entered Location object.
     * @param location A location object representing the location of the object you wish to access.
     * @return Returns the object at the location specified.
     */
    public Object getCell(Location location) {
        return board[location.getX()][location.getY()];
    }

}
