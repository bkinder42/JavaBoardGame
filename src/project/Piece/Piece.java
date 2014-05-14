package project.Piece;
import project.Resources.*;

import java.awt.*;

/**
 * This is a simple class to represent a chess piece. This class is only used to pass down variables and methods to other classes through
 * inheritance.
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 */
public abstract class Piece {
    private Color color;
    private final boolean white;
    private Location location;
    @SuppressWarnings("WeakerAccess")
    protected String symbol = "";


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
    boolean isWhite() {
        return white;
    }

    /**
     * Returns the 'symbol' to be used by the CLI class to represent the piece.
     * @return String representing the Piece to be used by the CLI Class.
     */
    public String getSymbol(){
        return symbol;
    }


    @Override
    public String toString() {
        return "project.Piece{" +
                "color=" + color +
                ", location=" + location +
                '}';
    }
}
