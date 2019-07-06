import com.ve3yn4uk.shapes.impl.Triangle;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static com.ve3yn4uk.utils.MyAppUtils.round;
import static java.lang.Math.sqrt;


public class TriangleTest {

    private Triangle triangle;

    @Test
    public void triangleSquareTest() {

        triangle = new Triangle(15.0, 15.0);

        double actualValue = triangle.getSquare();

        double expectedValue = round(15.0 * 15.0 * 0.5);

        assertEquals("error with triangle square", true, actualValue == expectedValue);

    }

    @Test
    public void traingleHypotenuseTest() {

        triangle = new Triangle(10.0, 10.0);

        double actualValue = triangle.getHypotenuse();

        double expectedValue = round(sqrt(10.0 * 10.0 + 10.0 * 10.0));

        assertEquals("error with triangle hypotenuse", true, actualValue == expectedValue);
    }
}