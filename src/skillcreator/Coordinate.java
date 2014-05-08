package skillcreator;

/**
 *
 * @author Peixoto
 */

public class Coordinate {
    private int x;
    private int y;
       
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getCoord() {
        return (new StringBuilder()).append("").append(x).append(",").append(y).toString();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

