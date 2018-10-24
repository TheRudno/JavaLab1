package view;

import model.Polygon;

public class Main {

    public static void main(String[] args) {
        Polygon p = new Polygon();
        System.out.println(p.calculateArea());
        p.printVertices();

    }
}
