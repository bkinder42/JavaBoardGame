package project.UI;

import project.Board.Board;
import project.Piece.Piece;

/**
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 * Date: 5/13/2014
 * Time: 9:41 AM
 */
public class CLI {
    public CLI (Board board) {
        for (int i = 7; i >= 0; i--) {
            for (int j = 7; j >= 0; j--) {
                if (board.getCell(j, i) == null) {
                    System.out.print("-\t");
                } else {
                    Piece p = (Piece)board.getCell(j, i);
                    System.out.print(p.getSymbol() + "\t");
                }
            }
            System.out.println(i + 1);
        }
        System.out.println("1\t2\t3\t4\t5\t6\t7\t8");
    }

}
