import lombok.extern.slf4j.Slf4j;


@Slf4j
public class TriangleSquare {
  //  org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TriangleSquare.class);

    /* return:
     * -1 -> if incorrect data is entered
     * 0 -> if the shape is not a triangle
     * double -> correct case
     */
    public double triangleSquare(int a, int b, int c) {
        log.debug("check variables");
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            log.error("incorrect data is entered");
            return -1;
        } else if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
            log.error("the shape is not a triangle");
            return 0;
        } else {
            log.info("square calculation");
            return 0.5 * (a + b + c);
        }
    }


    /* Case with exceptions:
     * return String with:
     * exception -> if incorrect data is entered or the shape is not a triangle
     * double -> correct case
     */
    public void triangleSquareCheck(int a, int b, int c) throws TriangleSquareException {
        log.info("check variables with exceptions");
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            log.error("incorrect data is entered");
            throw new TriangleSquareException("Incorrect data is entered");
        } else if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
            log.error("the shape is not a triangle");
            throw new TriangleSquareException("The shape is not a triangle");
        }
    }

    public String triangleSquareEx(int a, int b, int c) throws TriangleSquareException {
        try {
            log.debug("try to square calculation");
            triangleSquareCheck(a, b, c);
            log.info("there are no any exceptions, calculation of square");
            return Double.toString(0.5 * (a + b + c));
        } catch (TriangleSquareException e) {
            log.error("one or more variables are incorrect");
            return e.getMessage();
        }
    }
}
