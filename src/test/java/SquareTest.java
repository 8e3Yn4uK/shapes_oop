import com.ve3yn4uk.shapes.impl.Square;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static com.ve3yn4uk.utils.MyAppUtils.round;

public class SquareTest {

    private Square square;

    @Test
    public void squareTest() {

        square = new Square(15.0);

        double actualValue = square.getSquare();

        double expectedValue = round(15.0 * 15.0);

        assertEquals("error with square square :P", true, actualValue == expectedValue);
    }

    @Test
    public void squarePerimeterTest() {

        square = new Square(10.0);

        double actualValue = square.getPerimeter();

        double expectedValue = round(10.0 * 4);

        assertEquals("error with square perimeter", true, actualValue == expectedValue);
    }
}