import com.ve3yn4uk.shapes.impl.Circle;
import com.ve3yn4uk.utils.MyAppUtils;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CircleTest {


    Circle s = new Circle();

    @Test
    public void getSquare() {

        double methodValue = s.getSquare();

        double tempSquare = s.getRadius() * s.getRadius() * Math.PI;

        double res = MyAppUtils.round(tempSquare);

        assertEquals("error with circle square", true, methodValue == res);
    }

    @Test
    public void getCircuitLength() {

        double methodValue = s.getCircuitLength();

        double tempLength = s.getRadius() * 2 * Math.PI;

        double res = MyAppUtils.round(tempLength);

        assertEquals("error with circuit length", true, methodValue == res);
    }
}