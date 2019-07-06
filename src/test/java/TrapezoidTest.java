import com.ve3yn4uk.shapes.impl.Trapezoid;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static com.ve3yn4uk.utils.MyAppUtils.round;

public class TrapezoidTest {

    private Trapezoid trapezoid;

    @Test
    public void trapezoidSquareTest() {

        trapezoid = new Trapezoid(1.0, 2.0, 1.0);

        double actualValue = trapezoid.getSquare();

        double expectedValue = round((1.0 + 2.0) / 2 * 1.0);

        assertEquals("error with trapezoid square", true, actualValue == expectedValue);
    }

    @Test
    public void trapezoidMidlineTest() {

        trapezoid = new Trapezoid(2.0, 3.0, 1.0);

        double actualValue = trapezoid.getMidline();

        double expectedValue = round((2.0 + 3.0) / 2);

        assertEquals("error with trapezoid midline", true, actualValue == expectedValue);
    }
}