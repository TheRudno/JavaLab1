package model;

import java.util.*;

/**
 * Class allows to create Polygon
 * @author Michał Kamiński
 */
public class Polygon {
    /**
     * Area of polygon
     */
    private float area;
    /**
     * All vertices of polygon are stored in this container
     */
    private List<Point> vertices = new ArrayList<>();
    /**
     * Constructor for polygon
     */
    public Polygon(){}

    /**
     * Algorithm that  calculates area of polygon, returns float
     */
    public void calculateArea(){

        if(vertices.size() - 1 < 3)
            throw new NotPolygonException("Polygon should have at least 3 vertices");

        area = 0;

        for (int i = 0; i < vertices.size()-1; i++) {
            area+=(vertices.get(i).getX()*vertices.get(i+1).getY()-vertices.get(i).getY()*vertices.get(i+1).getX());
        }
        area = Math.abs(area / 2);

    }
    /**
     * Returns area of polygon
     * @return area of specific polygon
     */
    public float getArea() {
            return area;
    }
    /**
     * Returns list of polygon vertices
     * @return list of vertices
     */
    public List<Point> getVertices() {
        return Collections.unmodifiableList(vertices);
    }
    /**
     * Replace list of polygon vertices
     * @param  vertices list of vertices
     */
    public void setVertices(List<Point> vertices) {
        this.vertices = vertices;
    }
}
