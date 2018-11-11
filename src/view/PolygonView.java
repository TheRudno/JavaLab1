package view;

import model.Point;

import java.util.List;
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

}
