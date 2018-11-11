/**
 * @author Michał Kamiński
 */

import controller.PolygonController;


public class Main {

    public static void main(String[] args) {

        /**
         * Basic app operation using MVC
         */
        PolygonController polygonController =  new PolygonController(args);
        polygonController.calculatePolygonArea();
        polygonController.updateView();

    }
}
