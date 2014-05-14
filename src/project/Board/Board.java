package project.Board;

import project.Piece.*;
import project.Resources.Location;

/**
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class Board {
    private final Object[][] board = new Object[8][8];
    private final Pawn wp1 = new Pawn(true, new Location(0, 1));
    private final Pawn wp2 = new Pawn(true, new Location(1, 1));
    private final Pawn wp3 = new Pawn(true, new Location(2, 1));
    private final Pawn wp4 = new Pawn(true, new Location(3, 1));
    private final Pawn wp5 = new Pawn(true, new Location(4, 1));
    private final Pawn wp6 = new Pawn(true, new Location(5, 1));
    private final Pawn wp7 = new Pawn(true, new Location(6, 1));
    private final Pawn wp8 = new Pawn(true, new Location(7, 1));
    private final Rook wr1 = new Rook(true, new Location(0, 0));
    private final Rook wr2 = new Rook(true, new Location(7, 0));
    private final Knight wkn1 = new Knight(true, new Location(1, 0));
    private final Knight wkn2 = new Knight(true, new Location(6, 0));
    private final Bishop wb1 = new Bishop(true, new Location(2, 0));
    private final Bishop wb2 = new Bishop(true, new Location(5, 0));
    private final Queen wq = new Queen(true, new Location(3, 0));
    private final King wk = new King(true, new Location(4, 0));

    private final Pawn bp1 = new Pawn(false, new Location(0, 6));
    private final Pawn bp2 = new Pawn(false, new Location(1, 6));
    private final Pawn bp3 = new Pawn(false, new Location(2, 6));
    private final Pawn bp4 = new Pawn(false, new Location(3, 6));
    private final Pawn bp5 = new Pawn(false, new Location(4, 6));
    private final Pawn bp6 = new Pawn(false, new Location(5, 6));
    private final Pawn bp7 = new Pawn(false, new Location(6, 6));
    private final Pawn bp8 = new Pawn(false, new Location(7, 6));
    private final Rook br1 = new Rook(false, new Location(0, 7));
    private final Rook br2 = new Rook(false, new Location(7, 7));
    private final Knight bkn1 = new Knight(false, new Location(1, 7));
    private final Knight bkn2 = new Knight(false, new Location(6, 7));
    private final Bishop bb1 = new Bishop(false, new Location(2, 7));
    private final Bishop bb2 = new Bishop(false, new Location(5, 7));
    private final Queen bq = new Queen(false, new Location(3, 7));
    private final King bk = new King(false, new Location(4, 7));



    public Board() {
        init();
    }

    public void addToBoard(Piece piece) {
        int x = piece.getLocation().getX();
        int y = piece.getLocation().getY();
        board[x][y] = piece;
    }

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

    public Object getCell(int x, int y) {
        return board[x][y];
    }

}
