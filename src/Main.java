/**
 * @author Michał Kamiński
 */

import client.TCPClient;
import controller.PolygonController;


public class Main {

    public static void main(String[] args) throws Exception {

        /**
         * Basic app operation using MVC
         */
       // PolygonController polygonController =  new PolygonController(args);
        //polygonController.calculatePolygonArea();
        //polygonController.updateView();

        TCPClient tcpClient = new TCPClient();
        tcpClient.runClient();
    }
}
