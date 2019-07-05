import com.ve3yn4uk.shapes.impl.Triangle;
import com.ve3yn4uk.utils.MyAppUtils;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TriangleTest {

    Triangle triangle = new Triangle();

    @Test
    public void getSquare() {

        double methodValue = triangle.getSquare();

        double tempRes = triangle.getCathetus_1() * triangle.getCathetus_2() * 0.5;

        double res = MyAppUtils.round(tempRes);

        assertEquals("error with triangle square", true, methodValue == res);

    }

    @Test
    public void getHypotenuse() {

        double methodValue = triangle.getHypotenuse();

        double tempRes = (triangle.getCathetus_1() * triangle.getCathetus_1()) + (triangle.getCathetus_2() * triangle.getCathetus_2());

        double res = MyAppUtils.round(Math.sqrt(tempRes));

        assertEquals("error with triangle hypotenuse", true, methodValue == res);
    }
}