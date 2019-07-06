import com.ve3yn4uk.shapes.impl.Circle;
import org.junit.Test;

import static java.lang.Math.PI;
import static com.ve3yn4uk.utils.MyAppUtils.round;

import static junit.framework.TestCase.assertEquals;


public class CircleTest {

    private Circle circle;

    @Test
    public void circleSquareTest() {

        circle = new Circle(10);

        double actualValue = circle.getSquare();

        double expectedValue = round(10 * 10 * PI);

        assertEquals("error with circle square", true, actualValue == expectedValue);
    }

    @Test
    public void circleLengthTest() {

        circle = new Circle(20);

        double actualValue = circle.getCircuitLength();

        double expectedValue = round(20 * 2 * PI);

        assertEquals("error with circuit length", true, actualValue == expectedValue);
    }
}