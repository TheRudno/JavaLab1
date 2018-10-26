package model;

public class NotPolygonException extends RuntimeException {
    /**
     * Throw custom exception when user pass less then 3 vertices
     */
    public NotPolygonException(String message) {
        super(message);
    }

}
