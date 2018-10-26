package model;

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
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Return point x value
     */
    public float getX() {
        return x;
    }
    /**
     * Return point y value
     */
    public float getY() {
        return y;
    }
    /**
     * Print point x and y values
     */
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
