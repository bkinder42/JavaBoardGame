package project.Piece;
import project.Board.Board;
import project.Resources.*;

import java.awt.*;
import java.util.Vector;

/**
 * This is a simple class to represent a chess piece. This class is only used to pass down variables and methods to other classes through
 * inheritance.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public abstract class Piece {
    /**
     * A vector that will contain all of the places on the Board that the Pawn can move. These places are stored in Location objects.
     * @see project.Resources.Location
     */
    protected final Vector<Location> movement = new Vector<Location>(0, 1);

    protected int moves = 0;
    private Color color;
    private final boolean white;
    private Location location;
    @SuppressWarnings("WeakerAccess")
    protected String symbol = "";
    protected boolean dead = false;


    /**
     * Constructor that creates a Piece and sets color and location variables.
     * @param white A boolean that determines the color of the Piece.
     * @param location A Location Object that determines the location of the piece on the board.
     * @see project.Resources.Location
     */
    Piece(boolean white, Location location) {
        this.location = location;
        this.white = white;
        if (white) {
            this.color = Color.WHITE;
        } else {
            this.color = Color.BLACK;
        }
    }

    /**
     * Returns the color of the Piece
     * @return The color of the Piece as a Java Color Object.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Returns the location of the Piece on the Board.
     * @return The location of the Piece on the board as a Location Object
     * @see project.Resources.Location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the location of the Piece on the Board.
     * @param location the location on the Board to move the Piece to as a Location Object.
     * @see project.Resources.Location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Returns a boolean telling if the Piece is white.
     * @return A boolean, if true the Piece is white, if false the Piece is black.
     */
    public boolean isWhite() {
        return white;
    }

    /**
     * Returns the 'symbol' to be used by the CLI class to represent the piece.
     * @return String representing the Piece to be used by the CLI Class.
     */
    public String getSymbol(){
        return symbol;
    }

    public void setOut(boolean b){
        dead = b;
    }

    public Vector<Location> getMovement(Board board) {
        setMovement(board);
        return movement;
    }

    public void setMovement(Board board) {

    }

    public void move(Board b, Location l) {
        setMovement(b);
        boolean contains = false;
        for (int i = 0; i < movement.capacity(); i++) {
            if (movement.elementAt(i).getX() == l.getX() && movement.elementAt(i).getY() == l.getY()) {
                contains = true;
            }
        }
        if (contains) {
            b.moveOnBoard(this, l);
        } else {
            System.out.println("Invalid Move");
        }
        moves++;
    }

    public boolean isDead() {
        return dead;
    }

    @Override
    public String toString() {
        return "project.Piece{" +
                "color=" + color +
                ", location=" + location +
                '}';
    }
}
