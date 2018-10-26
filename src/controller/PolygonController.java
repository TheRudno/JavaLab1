package controller;

import model.NotPolygonException;
import model.Polygon;
import view.PolygonView;

import java.util.ArrayList;

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
     */
    public PolygonController(Polygon polygon, PolygonView view) {
        this.polygon = polygon;
        this.view = view;
    }
    /**
     * Calculates area of polygon, handles custom exception if Polygon doesn't match requirements
     */
    public void calculatePolygonArea(){
        try {
            polygon.calculateArea();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
    /**
     * Calls PolygonView method which prints basic inforamtion about Polygon
     */
    public void updateView(){
        view.printPolygonDetails(polygon.getArea(),(ArrayList)polygon.getVertices());
    }
    /**
     * Returns Polygon area
     */
    public float getPolygonArea(){
        return polygon.getArea();
    }

}
