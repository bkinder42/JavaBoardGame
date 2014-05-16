package project.UI;

import project.Board.Board;
import project.Piece.Piece;
import project.Resources.Location;

/**
 * A class to manage the Command Line or text version of the game.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class CLI {
    private Board board;
    public CLI (Board board) {
        this.board = board;
        drawBoard();
    }

    public void drawBoard() {
        for (int i = 7; i >= 0; i--) {
            for (int j = 7; j >= 0; j--) {
                if (board.getCell(new Location(j, i)) == null) {
                    System.out.print("-\t");
                } else {
                    Piece p = (Piece)board.getCell(new Location(j, i));
                    System.out.print(p.getSymbol() + "\t");
                }
            }
            System.out.println(i + 1);
        }
        System.out.println("1\t2\t3\t4\t5\t6\t7\t8");
    }

}
