package model;

/**
 @author Michał Kamiński
 */
public class Point {
    /**
     * Point x value
     */
    private float x;
    /**
     * Point y value
     */
    private float y;
    /**
     * Point constructor, taking two float values
     * @param x x coordinate
     * @param y y coordinate
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Return point x value
     * @return x coordinate
     */
    public float getX() {
        return x;
    }
    /**
     * Return point y value
     * @return y coordinate
     */
    public float getY() {
        return y;
    }
    /**
     * Print point x and y values
     * @return string
     */
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
