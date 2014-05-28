package project.Board;

import project.Piece.*;
import project.Resources.Location;

import java.awt.*;
import java.util.Vector;

/**
 * A class to manage the board, add and remove pieces.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class Board {
    private final Piece[][] board = new Piece[8][8];
    private Vector<Piece> pieces = new Vector<Piece>(32, 1);
    private Vector<Piece> white = new Vector<Piece>(16, 1);
    private Vector<Piece> black = new Vector<Piece>(16, 1);

    Pawn wp1 = new Pawn(true, new Location(0, 1));
    Pawn wp2 = new Pawn(true, new Location(1, 1));
    Pawn wp3 = new Pawn(true, new Location(2, 1));
    Pawn wp4 = new Pawn(true, new Location(3, 1));
    Pawn wp5 = new Pawn(true, new Location(4, 1));
    Pawn wp6 = new Pawn(true, new Location(5, 1));
    Pawn wp7 = new Pawn(true, new Location(6, 1));
    Pawn wp8 = new Pawn(true, new Location(7, 1));
    Rook wr1 = new Rook(true, new Location(0, 0));
    Rook wr2 = new Rook(true, new Location(7, 0));
    Knight wkn1 = new Knight(true, new Location(1, 0));
    Knight wkn2 = new Knight(true, new Location(6, 0));
    Bishop wb1 = new Bishop(true, new Location(2, 0));
    Bishop wb2 = new Bishop(true, new Location(5, 0));
    Queen wq = new Queen(true, new Location(3, 0));
    King wk = new King(true, new Location(4, 0));

    Pawn bp1 = new Pawn(false, new Location(0, 6));
    Pawn bp2 = new Pawn(false, new Location(1, 6));
    Pawn bp3 = new Pawn(false, new Location(2, 6));
    Pawn bp4 = new Pawn(false, new Location(3, 6));
    Pawn bp5 = new Pawn(false, new Location(4, 6));
    Pawn bp6 = new Pawn(false, new Location(5, 6));
    Pawn bp7 = new Pawn(false, new Location(6, 6));
    Pawn bp8 = new Pawn(false, new Location(7, 6));
    Rook br1 = new Rook(false, new Location(0, 7));
    Rook br2 = new Rook(false, new Location(7, 7));
    Knight bkn1 = new Knight(false, new Location(1, 7));
    Knight bkn2 = new Knight(false, new Location(6, 7));
    Bishop bb1 = new Bishop(false, new Location(2, 7));
    Bishop bb2 = new Bishop(false, new Location(5, 7));
    Queen bq = new Queen(false, new Location(3, 7));
    King bk = new King(false, new Location(4, 7));

    private void initVector() {
        pieces.add(wp1);
        pieces.add(wp2);
        pieces.add(wp3);
        pieces.add(wp4);
        pieces.add(wp5);
        pieces.add(wp6);
        pieces.add(wp7);
        pieces.add(wp8);
        pieces.add(wr1);
        pieces.add(wr2);
        pieces.add(wkn1);
        pieces.add(wkn2);
        pieces.add(wb1);
        pieces.add(wb2);
        pieces.add(wk);
        pieces.add(wq);

        pieces.add(bp1);
        pieces.add(bp2);
        pieces.add(bp3);
        pieces.add(bp4);
        pieces.add(bp5);
        pieces.add(bp6);
        pieces.add(bp7);
        pieces.add(bp8);
        pieces.add(br1);
        pieces.add(br2);
        pieces.add(bkn1);
        pieces.add(bkn2);
        pieces.add(bb1);
        pieces.add(bb2);
        pieces.add(bq);
        pieces.add(bk);

        for (int i = 0; i < pieces.capacity(); i++) {
            if (pieces.elementAt(i).isWhite() && !pieces.elementAt(i).isDead()) {
                white.add(pieces.elementAt(i));
            }

            if (!pieces.elementAt(i).isWhite() && !pieces.elementAt(i).isDead()) {
                black.add(pieces.elementAt(i));
            }
        }
    }

    public Vector<Piece> getWhite() {
        return white;
    }

    public Vector<Piece> getBlack() {
        return black;
    }

    public Vector<Piece> getPieces() {
        return pieces;
    }

    public Board() {
        init();
        initVector();
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
            getCell(location).setOut(true);
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
        addToBoard(wp1);
        addToBoard(wp2);
        addToBoard(wp3);
        addToBoard(wp4);
        addToBoard(wp5);
        addToBoard(wp6);
        addToBoard(wp7);
        addToBoard(wp8);
        addToBoard(wr1);
        addToBoard(wr2);
        addToBoard(wkn1);
        addToBoard(wkn2);
        addToBoard(wb1);
        addToBoard(wb2);
        addToBoard(wq);
        addToBoard(wk);

        addToBoard(bp1);
        addToBoard(bp2);
        addToBoard(bp3);
        addToBoard(bp4);
        addToBoard(bp5);
        addToBoard(bp6);
        addToBoard(bp7);
        addToBoard(bp8);
        addToBoard(br1);
        addToBoard(br2);
        addToBoard(bkn1);
        addToBoard(bkn2);
        addToBoard(bb1);
        addToBoard(bb2);
        addToBoard(bq);
        addToBoard(bk);

    }

    /**
     * Returns the object at the location specified in the entered Location object.
     * @param location A location object representing the location of the object you wish to access.
     * @return Returns the object at the location specified.
     */
    public Piece getCell(Location location) {
        return board[location.getX()][location.getY()];
    }

}
