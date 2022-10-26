public class TriangleSquareException extends Exception {
    String message;

    public TriangleSquareException(String message) {
        this.message = message;
        //   super();
    }

    public String getMessage() {
        return this.message;
    }
}
