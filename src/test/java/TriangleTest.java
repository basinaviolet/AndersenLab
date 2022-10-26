import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {
    TriangleSquare tSquare = new TriangleSquare();

    private static Stream<Arguments> realItems() {
        return Stream.of(
                Arguments.of(2, 3, 4, 4.5),
                Arguments.of(3, 3, 3, 4.5),
                Arguments.of(3, 4, 5, 6),
                Arguments.of(1100, 1100, 100, 1150)
        );
    }

    private static Stream<Arguments> unrealItems() {
        return Stream.of(
                Arguments.of(0, 0, 0, -1),
                Arguments.of(0, 3, 4, -1),
                Arguments.of(2, 0, 4, -1),
                Arguments.of(2, 3, 0, -1),
                Arguments.of(-1, 3, 3, -1),
                Arguments.of(3, -1, 3, -1),
                Arguments.of(3, 3, -3, -1),
                Arguments.of(-2, -2, -2, -1)
        );
    }


    private static Stream<Arguments> notTriangle() {
        return Stream.of(
                Arguments.of(1, 2, 3, 0),
                Arguments.of(10, 4, 5, 0),
                Arguments.of(100, 99, 300, 0)
        );
    }


    //---------------- double result -----------------------
    @ParameterizedTest(name = "Square with sides: {0}, {1}, {2} = {3}")
    @MethodSource("realItems")
    void triangleSquareTrueTest(int a, int b, int c, double result) throws TriangleSquareException {
        assertEquals(result, tSquare.triangleSquare(a, b, c), 0.01);
    }

    @ParameterizedTest(name = "One or more numbers from: {0}, {1}, {2} are incorrect")
    @MethodSource("unrealItems")
    void triangleSquareUnrealTest(int a, int b, int c, double result) {
        assertEquals(result, tSquare.triangleSquare(a, b, c));
        //assertEquals(exception.getMessage(), "Incorrect data is entered");
    }

    @ParameterizedTest(name = "The shape with sides: {0}, {1}, {2} is not a triangle")
    @MethodSource("notTriangle")
    void triangleSquareNotTriangleTest(int a, int b, int c, double result) {
        assertEquals(result, tSquare.triangleSquare(a, b, c));
        //assertEquals(exception.getMessage(), "The shape is not a triangle");
    }
    //----------------------------------------------------------------------

    //---------------- String result with exceptions -----------------------
    private static Stream<Arguments> realItemsException() {
        return Stream.of(
                Arguments.of(2, 3, 4, "4.5"),
                Arguments.of(3, 3, 3, "4.5"),
                Arguments.of(3, 4, 5, "6.0"),
                Arguments.of(1100, 1100, 100, "1150.0")
        );
    }

    private static Stream<Arguments> unrealItemsException() {
        return Stream.of(
                Arguments.of(0, 0, 0),
                Arguments.of(0, 3, 4),
                Arguments.of(2, 0, 4),
                Arguments.of(2, 3, 0),
                Arguments.of(-1, 3, 3),
                Arguments.of(3, -1, 3),
                Arguments.of(3, 3, -3),
                Arguments.of(-2, -2, -2)
        );
    }

    private static Stream<Arguments> notTriangleException() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(10, 4, 5),
                Arguments.of(100, 99, 300)
        );
    }
    @ParameterizedTest(name = "Square with sides: {0}, {1}, {2} = {3}")
    @MethodSource("realItemsException")
    void triangleSquareTrueTestException(int a, int b, int c, String result) {
        assertEquals(Double.parseDouble(result), tSquare.triangleSquare(a, b, c), 0.01);
    }

    @ParameterizedTest(name = "One or more numbers from: {0}, {1}, {2} are incorrect")
    @MethodSource("unrealItemsException")
    void triangleSquareUnrealTestException(int a, int b, int c) throws TriangleSquareException {
        String message = "Incorrect data is entered";
        Throwable exception = assertThrows(TriangleSquareException.class,
                () -> {
                    throw new TriangleSquareException(message);
                });
        assertEquals(exception.getMessage(), tSquare.triangleSquareEx(a, b, c));
    }

    @ParameterizedTest(name = "The shape with sides: {0}, {1}, {2} is not a triangle")
    @MethodSource("notTriangleException")
    void triangleSquareNotTriangleTestException(int a, int b, int c) throws TriangleSquareException {
        String message = "The shape is not a triangle";
        Throwable exception = assertThrows(TriangleSquareException.class,
                () -> {
                    throw new TriangleSquareException(message);
                });
        assertEquals(exception.getMessage(), tSquare.triangleSquareEx(a, b, c));
    }
    //----------------------------------------------------------------------
}
