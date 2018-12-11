package view;

import model.Point;
import model.Polygon;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *@author Michał Kamiński
 * Prints basic information about polygon
 */
public class PolygonView {
    /**
     * Prints basic information about polygon vertices
     * @param area
     *  area of polygon
     * @param  vertices
     *  vertices of polygon
     */
    public void printPolygonDetails(float area, List<Point> vertices){
        System.out.println("Area of polygon with vertices: ");
        vertices.forEach( v ->  System.out.println(v));  //Consumer functional interface
        System.out.println("Notice, last point is duplicate of first");
        System.out.println("Is: " + area);
    }

    /**
     * Just tu use command line arguments, passing Polygon vertices would be inefficient and time consuming
     * @param args
     *      array of console arguments
     */
    public void welcomeMsg(String args[]){
        if(args.length >  0){
            System.out.println("Witamy w kalkulatorze figur w wersji: " + args[0]);
        }
        else{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Jaka wersja programu?");
            System.out.println("Witamy w kalkulatorze figur w wersji: " + scanner.next());

        }
    }

    /**
     * Method responsible for interaction with user about certain polygon vertices
     * @param polygon polygon to initialize
     */
    public void initializePolygon(Polygon polygon){
        List<Point> vertices = new ArrayList<>();
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
        if(!vertices.isEmpty())
            vertices.add(new Point(vertices.get(0).getX(),vertices.get(0).getY()));
        polygon.setVertices(vertices);
    }

}
