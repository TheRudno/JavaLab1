package controller;

import model.Polygon;
import view.PolygonView;

import java.util.ArrayList;

public class PolygonController {
    private Polygon polygon;
    private PolygonView view;

    public PolygonController(Polygon polygon, PolygonView view) {
        this.polygon = polygon;
        this.view = view;
    }

    public void updateView(){
        view.printPolygonDetails(polygon.getArea(),(ArrayList)polygon.getVertices());
    }


}
