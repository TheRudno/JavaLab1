import controller.PolygonController;
import model.Polygon;
import view.PolygonView;

public class Main {

    public static void main(String[] args) {
        Polygon p = new Polygon();
        PolygonView v = new PolygonView();
        PolygonController c =  new PolygonController(p,v);
        c.updateView();

    }
}
