public class TriangleSquare {

    /* return:
     * -1 -> if incorrect data is entered
     * 0 -> if the shape is not a triangle
     * double -> correct case
     */
    public double triangleSquare(int a, int b, int c) {
        if ((a <= 0) || (b <= 0) || (c <= 0))
            return -1;
            //throw new TriangleSquareException("Incorrect data is entered");
        else if ((a + b <= c) || (b + c <= a) || (c + a <= b))
            return 0;
            //throw new TriangleSquareException("The shape is not a triangle");
        else
            return 0.5 * (a + b + c);
    }


    /* Case with exceptions:
     * return String with:
     * exception -> if incorrect data is entered or the shape is not a triangle
     * double -> correct case
     */
    public void triangleSquareCheck(int a, int b, int c) throws TriangleSquareException {
        if ((a <= 0) || (b <= 0) || (c <= 0))
            //   return -1;
            throw new TriangleSquareException("Incorrect data is entered");
        else if ((a + b <= c) || (b + c <= a) || (c + a <= b))
            //    return 0;
            throw new TriangleSquareException("The shape is not a triangle");
    }

    public String triangleSquareEx(int a, int b, int c) throws TriangleSquareException {
        try {
            triangleSquareCheck(a, b, c);
            return Double.toString(0.5 * (a + b + c));
        } catch (TriangleSquareException e) {
            return e.getMessage();
        }
    }
}
