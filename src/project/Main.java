package project;

import project.Board.Board;
import project.UI.CLI;

/**
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 * Date: 5/13/2014
 * Time: 9:35 AM
 */
public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        CLI cli = new CLI(b);

    }

}
