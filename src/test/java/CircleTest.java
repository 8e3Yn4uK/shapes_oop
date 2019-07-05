import com.ve3yn4uk.shapes.Circle;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CircleTest {


    Circle s = new Circle();

    @Test
    public void getSquare() {

        double square = s.getSquare();

        double tempSquare = s.getRadius() * s.getRadius() * Math.PI;

        double res = (double) Math.round(tempSquare * 100) / 100;

        assertEquals("error with circle square", true, square == res);
    }

    @Test
    public void getCircuitLength() {

        double sl = s.getCircuitLength();

        double tempLength = s.getRadius() * 2 * Math.PI;

        double res = (double) Math.round(tempLength * 100) / 100;

        assertEquals("error with circuit length", true, sl == res);
    }
}