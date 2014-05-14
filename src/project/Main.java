package project;

import project.Board.Board;
import project.UI.CLI;

/**
 * The main driver class for the project.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        CLI cli = new CLI(b);

    }

}
