package view;

import model.Point;

import java.util.ArrayList;
/**
 * Prints basic information about polygon
 */
public class PolygonView {
    public void printPolygonDetails(float area, ArrayList<Point> vertices){
        System.out.println("Area of polygon with vertices: ");
        for (Point p:vertices) {
            System.out.println(p);
        }
        System.out.println("Is: " + area);
    }
}
