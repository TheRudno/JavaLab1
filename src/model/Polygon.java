package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Class allows to create Polygon
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
    public Polygon() {
        initializePolygon();
    }
    /**
     * Method responsible for interaction with user about certain polygon vertices
     */
    private void initializePolygon(){
        vertices.clear();
        System.out.println("Podaj liczbe wierzchołków");
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        int verticesNr = s.nextInt();
        float x,y;
        for (int i = 0; i < verticesNr; i++) {
            System.out.println("Podaj współrzędna X wierzchołka:" + (i+1));
            x = s.nextFloat();
            System.out.println("Podaj współrzędna Y wierzchołka:" + (i+1));
            y = s.nextFloat();
            vertices.add(new Point(x,y));
        }
        if(vertices.size()>0);
        vertices.add(new Point(vertices.get(0).getX(),vertices.get(0).getY()));
    }
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
     */
    public float getArea() {
            return area;
    }
    /**
     * Returns list of polygon vertices
     */
    public List<Point> getVertices() {
        return vertices;
    }
}
