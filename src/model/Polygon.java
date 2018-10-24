package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Polygon {

    private float area;
    private int verticesNr = 0;
    private List<Point> vertices = new ArrayList<>();

    public Polygon() {
        initializePolygon();
    }

    private void initializePolygon(){
        System.out.println("Podaj liczbe wierzchołków");
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        verticesNr = s.nextInt();
        float x,y;
        for (int i = 0; i < verticesNr; i++) {
            System.out.println("Podaj współrzędna X wierzchołka:" + (i+1));
            x = s.nextFloat();
            System.out.println("Podaj współrzędna Y wierzchołka:" + (i+1));
            y = s.nextFloat();
            vertices.add(new Point(x,y));
        }
        vertices.add(new Point(vertices.get(0).getX(),vertices.get(0).getY()));
    }

    public float calculateArea(){
        area = 0;

        for (int i = 0; i < vertices.size()-1; i++) {
            area+=(vertices.get(i).getX()*vertices.get(i+1).getY()-vertices.get(i).getY()*vertices.get(i+1).getX());
        }
        area = Math.abs(area / 2);

        return area;
    }


    public void printVertices(){
        for (Point p:vertices) {
            System.out.println(p);
        }
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getVerticesNr() {
        return verticesNr;
    }

    public void setVerticesNr(int verticesNr) {
        this.verticesNr = verticesNr;
    }
}
