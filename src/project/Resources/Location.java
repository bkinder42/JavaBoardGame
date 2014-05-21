package project.Resources;

/**
 * A simple class to store an X, Y location
 * @author Ben Kinder
 * @version 1.0
 * @since 5/14/2014
 */
public class Location implements Comparable {
    private int x;
    private int y;
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    @Override
    public String toString() {
        return "project.Resources.Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Location x = (Location)o;
        if (getX() == x.getX() && getY() == x.getY()) {
            return 0;
        } else {
            return -1;
        }

    }
}
