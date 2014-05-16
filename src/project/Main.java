package project;

import project.Board.Board;
import project.Piece.*;
import project.Resources.Location;
import project.UI.CLI;

import java.util.Vector;

/**
 * The main driver class for the project.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class Main {
    public static void main(String[] args) {
        Vector<Piece> pieces = new Vector<Piece>(32, 1);
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
        pieces.add(bk);
        pieces.add(bq);

        Board b = new Board();

        b.addToBoard(wp1);
        b.addToBoard(wp2);
        b.addToBoard(wp3);
        b.addToBoard(wp4);
        b.addToBoard(wp5);
        b.addToBoard(wp6);
        b.addToBoard(wp7);
        b.addToBoard(wp8);
        b.addToBoard(wr1);
        b.addToBoard(wr2);
        b.addToBoard(wkn1);
        b.addToBoard(wkn2);
        b.addToBoard(wb1);
        b.addToBoard(wb2);
        b.addToBoard(wq);
        b.addToBoard(wk);

        b.addToBoard(bp1);
        b.addToBoard(bp2);
        b.addToBoard(bp3);
        b.addToBoard(bp4);
        b.addToBoard(bp5);
        b.addToBoard(bp6);
        b.addToBoard(bp7);
        b.addToBoard(bp8);
        b.addToBoard(br1);
        b.addToBoard(br2);
        b.addToBoard(bkn1);
        b.addToBoard(bkn2);
        b.addToBoard(bb1);
        b.addToBoard(bb2);
        b.addToBoard(bq);
        b.addToBoard(bk);

        new CLI(b);
        wp1.move(b, new Location(0, 2));
        new CLI(b);

    }

}
