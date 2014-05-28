package project.UI;

import project.AI;
import project.Board.Board;
import project.Piece.Piece;
import project.Resources.Location;

import java.awt.*;
import java.util.Scanner;

/**
 * A class to manage the Command Line or text version of the game.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class CLI {
    private Board board;
    Scanner scan = new Scanner(System.in);
    boolean playing = true;



    public CLI (Board board) {
        this.board = board;
        drawBoard(board);

        AI ai = new AI(board, Color.WHITE);

        while (playing) {
            movePiece();
            ai.move(board);
            drawBoard(board);

        }
    }

    public void drawBoard(Board board) {
        for (int i = 7; i >= 0; i--) {
            for (int j = 7; j >= 0; j--) {
                if (board.getCell(new Location(j, i)) == null) {
                    System.out.print("-\t");
                } else {
                    Piece p = board.getCell(new Location(j, i));
                    System.out.print(p.getSymbol() + "\t");
                }
            }
            System.out.println(i + 1);
        }
        System.out.println("8\t7\t6\t5\t4\t3\t2\t1\t");
    }

    public void movePiece() {
        System.out.print("What is the location of the piece you wish to move?\nPlease " +
                "enter the X coordinate: ");
        int x = scan.nextInt();
        System.out.print("Please enter the Y coordinate: ");
        int y = scan.nextInt();

        System.out.print("Please enter the X coordinate of the location you wish to move to: ");
        int x2 = scan.nextInt();
        System.out.print("Please enter the Y coordinate of the location you wish to move to: ");
        int y2 = scan.nextInt();
        System.out.println();

        board.getCell(new Location(x, y)).move(board, new Location(x2, y2));
        drawBoard(board);

    }

}
