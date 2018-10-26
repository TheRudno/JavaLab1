/**
 * @author Michał Kamiński
 */

import controller.PolygonController;
import model.Polygon;
import view.PolygonView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * Just tu use command line arguments, passing Polygon vertices would be inefficient and time consuming
         */
        if(args.length >  0){
            System.out.println("Witamy w kalkulatorze figur w wersji: " + args[0]);
        }
        else{
            Scanner s = new Scanner(System.in);
            System.out.println("Jaka wersja programu?");
            System.out.println("Witamy w kalkulatorze figur w wersji: " + s.next());

        }
        /**
         * Basic app operation using MVC
         */
        Polygon p = new Polygon();
        PolygonView v = new PolygonView();
        PolygonController c =  new PolygonController(p,v);
        c.calculatePolygonArea();
        c.updateView();

    }
}
