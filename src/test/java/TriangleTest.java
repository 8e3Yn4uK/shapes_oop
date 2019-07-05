import com.ve3yn4uk.shapes.impl.Triangle;
import com.ve3yn4uk.utils.MyAppUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TriangleTest {

    Triangle t = new Triangle();

    @Test
    public void getSquare() {

        double methodValue = t.getSquare();

        double tempRes = t.getCathetus_1() * t.getCathetus_2() * 0.5;

        double res = MyAppUtils.round(tempRes);

        assertEquals("error with triangle square", true, methodValue == res);

    }

    @Test
    public void getHypotenuse() {

        double methodValue = t.getHypotenuse();

        double tempRes = (t.getCathetus_1() * t.getCathetus_1()) + (t.getCathetus_2() * t.getCathetus_2());

        double res = MyAppUtils.round(Math.sqrt(tempRes));

        assertEquals("error with triangle hypotenuse", true, methodValue == res);
    }
}