package Resources;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Ben
 * @version 1.0
 * @since 5/14/2014
 * Date: 5/14/2014
 * Time: 8:10 AM
 */
public class Location {
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
        return "Resources.Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}