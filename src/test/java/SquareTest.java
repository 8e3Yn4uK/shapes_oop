import com.ve3yn4uk.shapes.impl.Square;
import com.ve3yn4uk.utils.MyAppUtils;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareTest {

    Square square = new Square();

    @Test
    public void getSquare() {

        double methodValue = square.getSquare();

        double tempSquare = square.getSide() * square.getSide();

        double res = MyAppUtils.round(tempSquare);

        assertEquals("error with square square :P", true, methodValue == res);
    }

    @Test
    public void getPerimeter() {

        double methodValue = square.getPerimeter();

        double tempPerimeter = square.getSide() * 4;

        double res = MyAppUtils.round(tempPerimeter);

        assertEquals("error with square perimeter", true, methodValue == res);
    }
}