package test.model;

import model.NotPolygonException;
import model.Point;
import model.Polygon;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Michał Kamiński
 */

@TestMaker(creator = "Michał Kamiński", lastModified = "11-11-2018")

//no Test for Polygon initializePolygon() method, it just allows user to enter data

public class PolygonTest {


    private static Polygon polygon;

    @BeforeClass
    public static void beforeClass() {
        polygon = new Polygon();
    }

    @Test
    public void calculate_WITH_CORRECT_DATA() throws NotPolygonException {
        List<Point> vertices = new ArrayList<>();
        vertices.add(new Point(0,0));
        vertices.add(new Point(3,0));
        vertices.add(new Point(3,3));
        vertices.add(new Point(0,3));
        vertices.add(new Point(0,0));
                                            //square 3x3

        polygon.setVertices(vertices);
        polygon.calculateArea();
        assertEquals(9,polygon.getArea(),0);
    }

    @Test(expected = NotPolygonException.class)
    public void calculate_WITH_NOT_ENOUGH_VERTICES() throws NotPolygonException {
        List<Point> vertices = new ArrayList<>();
        vertices.add(new Point(0,0));
        vertices.add(new Point(1,1)); // 2 vertices - line not polygon
        polygon.setVertices(vertices);
        polygon.calculateArea();
    }

    @Test(expected = NotPolygonException.class)
    public void calculate_WITH_NO_VERTICES() throws NotPolygonException {
        List<Point> vertices = new ArrayList<>();
        polygon.setVertices(vertices);
        polygon.calculateArea();
    }


}





