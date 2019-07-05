import com.ve3yn4uk.shapes.impl.Trapezoid;
import com.ve3yn4uk.utils.MyAppUtils;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class TrapezoidTest {

    Trapezoid trapezoid = new Trapezoid();

    @Test
    public void getSquare() {

        double methodValue = trapezoid.getSquare();

        double testRes = (trapezoid.getBase1() + trapezoid.getBase2()) / 2 * trapezoid.getHeight();

        double res = MyAppUtils.round(testRes);

        assertEquals("error with trapezoid square", true, methodValue == res);
    }

    @Test
    public void getMidline() {

        double methodValue = trapezoid.getMidline();

        double testRes = (trapezoid.getBase1() + trapezoid.getBase2()) / 2;

        double res = MyAppUtils.round(testRes);

        assertEquals("error with trapezoid midline", true, methodValue == res);
    }
}