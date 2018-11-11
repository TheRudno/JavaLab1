package controller;

import model.Point;
import model.Polygon;
import view.PolygonView;

import java.util.List;

/**
 @author Michał Kamiński
 */

public class PolygonController {
    /**
     * Polygon model for MVC
     */
    private Polygon polygon;
    /**
     * PolygonView model for MVC
     */
    private PolygonView view;
    /**
     * PolygonController constructor, takes two values: Polygon and PolygonView
     * @param args console arguments array
     */
    public PolygonController(String args[]) {
        view = new PolygonView();
        view.welcomeMsg(args);
        polygon = new Polygon();
        polygon.initializePolygon();
    }
    /**
     * Calculates area of polygon, handles custom exception if Polygon doesn't match requirements
     */
    public void calculatePolygonArea(){
        try {
            polygon.calculateArea();
        }catch (Exception exception){
            System.out.println(exception.toString());
        }
    }
    /**
     * Calls PolygonView method which prints basic inforamtion about Polygon
     */
    public void updateView(){
        view.printPolygonDetails(getPolygonArea(),polygon.getVertices());
    }
    /**
     * Returns Polygon area
     * @return  area of polygon
     */
    public float getPolygonArea(){
        return polygon.getArea();
    }

    /**
     * Returns Polygon verrtices
     * @return list of polygon vertices
     */
    public List<Point> getVertices(){
        return polygon.getVertices();
    }

}
