package project.Piece;
import project.Resources.*;
import sun.awt.Symbol;

import java.awt.*;

/**
 * @author Ben Kinder
 * @version 1.0
 * @since 5/13/2014
 * Date: 5/13/2014
 * Time: 9:40 AM
 */
public abstract class Piece {
    private Color color;
    private boolean white;
    private Location location;
    protected String symbol = "";

    public Piece(boolean white, Location location) {
        this.location = location;
        this.white = white;
        if (white) {
            this.color = Color.WHITE;
        } else {
            this.color = Color.BLACK;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isWhite() {
        return white;
    }

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