package project.UI;

import project.Board.Board;
import project.Piece.Piece;
import project.Resources.Location;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.FileInputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Ben
 * @version 1.0
 * @since 5/29/2014
 * Date: 5/29/2014
 * Time: 9:38 AM
 */
public class GUIPanel extends JPanel implements MouseListener {
    Location loc1;
    Location loc2;
    Location baseLoc;
    Board board;
    ImageIcon image;
    int height = 700;
    int width = 700;
    int x = 10;
    int y = 10;
    int cellWidth = (width-10)/8;
    int cellHeight = (height-10)/8;
    MouseListener listener;
    Graphics page;

    public GUIPanel(Board board) {
        this.board = board;
        setBackground (Color.WHITE);
        setPreferredSize (new Dimension(700, 700));
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        int i = 8;
        int j = 8;

        page.setColor(Color.BLACK);
        for (i = 8; i > 0; i--) {
            for (j = 8; j > 0; j--) {
                page.drawRect(x, y, cellWidth, cellHeight);
                baseLoc = new Location(j-1, i-1);
                if (board.getCell(baseLoc) != null) {
                    if (board.getCell(baseLoc).getSymbol() == "wP") {
                        image = new ImageIcon("img/WhitePawn.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                    if (board.getCell(baseLoc).getSymbol() == "wR") {
                        image = new ImageIcon("img/WhiteRook.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                    if (board.getCell(baseLoc).getSymbol() == "wKn") {
                        image = new ImageIcon("img/WhiteKnight.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                    if (board.getCell(baseLoc).getSymbol() == "wB") {
                        image = new ImageIcon("img/WhiteBishop.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                    if (board.getCell(baseLoc).getSymbol() == "wQ") {
                        image = new ImageIcon("img/WhiteQueen.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                    if (board.getCell(baseLoc).getSymbol() == "wK") {
                        image = new ImageIcon("img/WhiteKing.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                    if (board.getCell(baseLoc).getSymbol() == "bP") {
                        image = new ImageIcon("img/BlackPawn.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                    if (board.getCell(baseLoc).getSymbol() == "bR") {
                        image = new ImageIcon("img/BlackRook.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                    if (board.getCell(baseLoc).getSymbol() == "bKn") {
                        image = new ImageIcon("img/BlackKnight.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                    if (board.getCell(baseLoc).getSymbol() == "bB") {
                        image = new ImageIcon("img/BlackBishop.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                    if (board.getCell(baseLoc).getSymbol() == "bQ") {
                        image = new ImageIcon("img/BlackQueen.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                    if (board.getCell(baseLoc).getSymbol() == "bK") {
                        image = new ImageIcon("img/BlackKing.png");
                        Image img = image.getImage();
                        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                        page.drawImage(img, x, y, cellWidth, cellHeight, null);
                    }
                }
                x += cellWidth;
            }
            x = 10;
            y += cellWidth;
        }

    }

    private Location findPiece (int x, int y) {
        Location location;

        int a = 7-((x-10)/cellWidth);
        int b = 7-((y-10)/cellHeight);
        location = new Location(a, b);

        return location;
    }

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {
        loc1 = findPiece(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        loc2 = findPiece(e.getX(), e.getY());
        board.getCell(loc1).move(board, loc2);
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
