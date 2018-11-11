package model;
/**
@author Michał Kamiński
*/
public class NotPolygonException extends RuntimeException {
    /**
     * Throw custom exception when user pass less then 3 vertices
     * @param message message to display
     */
    public NotPolygonException(String message) {
        super(message);
    }

}
