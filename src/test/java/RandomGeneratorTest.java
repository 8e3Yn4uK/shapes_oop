import com.ve3yn4uk.rnd.RandomGenerator;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class RandomGeneratorTest {

    @Test
    public void colorGeneratingTest(){

        String color = RandomGenerator.generateColor();

        List<String> colors_base = RandomGenerator.getColors();

        assertEquals("error with generating color", true, colors_base.contains(color));
    }

    @Test
    public void radiusGeneratingTest(){

        int i = RandomGenerator.generateRadius();

        assertEquals("error with generating radius", true, (i>0 && i<=20));
    }

    @Test
    public void sideGeneratingTest() {

        double d = RandomGenerator.generateSide();

        assertEquals("error with generating side", true, (d>0 && d<=20));
    }

    @Test
    public void cathetusGeneratingTest() {

        double d = RandomGenerator.generateCathetus();

        assertEquals("error with generating cathetus", true, (d>0 && d<=10));
    }

    @Test
    public void basesGeneratingTest() {

        double d = RandomGenerator.generateBases();

        assertEquals("error with generating cathetus", true, (d>0 && d<=15));
    }

    @Test
    public void shapeGeneratingTest() {

        int i = RandomGenerator.generateShape();

        assertEquals("error with generating integer for shape", true, (i>0 && i<=4));
    }

}
