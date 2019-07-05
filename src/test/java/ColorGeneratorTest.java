import com.ve3yn4uk.rnd.ColorGenerator;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ColorGeneratorTest {

    @Test
    public void generateColor(){

        String color = ColorGenerator.generateColor();

        List<String> colors_base = ColorGenerator.getColors();

        assertEquals("error with generating color", true, colors_base.contains(color));
    }
}
