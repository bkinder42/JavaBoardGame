package project.UI;

import project.Board.Board;

import javax.swing.*;

/**
 * A class to manage the graphical version of the game.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public class GUI {
    public static void main(String[] args) {
        Board board = new Board();
        JFrame frame = new JFrame("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GUIPanel panel = new GUIPanel(board);
        panel.repaint();

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }


}
