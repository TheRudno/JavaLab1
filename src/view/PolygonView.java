package view;

import model.Point;

import java.util.ArrayList;
/**
 * Prints basic information about polygon
 */
public class PolygonView {
    public void printPolygonDetails(float area, ArrayList<Point> vertices){
        System.out.println("Area of polygon with vertices: ");
        for (int i = 0; i < vertices.size()-1; i++) {
            System.out.println(vertices.get(i));
        }
        System.out.println("Is: " + area);
    }
}
