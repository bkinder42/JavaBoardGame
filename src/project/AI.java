package project;

import project.Board.Board;
import project.Piece.Piece;
import project.Resources.Location;

import java.awt.*;
import java.util.Random;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Ben
 * @version 1.0
 * @since 5/23/2014
 * Date: 5/23/2014
 * Time: 8:00 AM
 */
public class AI {
    private Vector<Piece> pieces = new Vector<Piece>(0, 1);
    private Random rand = new Random();
    private Color color;
    private int runs;

    public AI (Board board, Color playerColor) {
        if (playerColor == Color.WHITE) {
            color = Color.BLACK;
        }

        if (playerColor == Color.BLACK) {
            color = Color.WHITE;
        }
        refreshVector(board);
    }

    public Board move(Board board) {
        boolean run = true;
        Vector<Piece> p;
        p =  (Vector) pieces.clone();
        refreshVector(board);
        while (p.capacity() > 0 && run) {
            p.trimToSize();
            int num = rand.nextInt(p.capacity());
            Location l = p.elementAt(num).getLocation();
            Vector<Location> locations = board.getCell(l).getMovement(board);
            if (locations.capacity() > 0) {
                Location l2 = locations.elementAt(rand.nextInt(locations.capacity()));
                board.getCell(l).move(board, l2);
                runs = 0;
                run = false;
            } else {
                p.remove(num);
            }
        }
        return board;

    }

    private void refreshVector(Board board) {
        if (color == Color.WHITE) {
            pieces = board.getWhite();
        }

        if (color == Color.BLACK) {
            pieces = board.getBlack();
        }
        pieces.trimToSize();
    }

}
