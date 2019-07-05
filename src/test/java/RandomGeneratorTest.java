import com.ve3yn4uk.rnd.RandomGenerator;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class RandomGeneratorTest {

    @Test
    public void generateColor(){

        String color = RandomGenerator.generateColor();

        List<String> colors_base = RandomGenerator.getColors();

        assertEquals("error with generating color", true, colors_base.contains(color));
    }

    @Test
    public void generateRadius(){

        int i = RandomGenerator.generateRadius();

        assertEquals("error with generating radius", true, (i>0 && i<=20));
    }

    @Test
    public void generateSide() {

        double d = RandomGenerator.generateSide();

        assertEquals("error with generating side", true, (d>0 && d<=20));
    }
}
