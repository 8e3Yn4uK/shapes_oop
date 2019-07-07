package com.ve3yn4uk.rnd;

import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.ve3yn4uk.utils.MyAppUtils.round;

public class RandomGenerator {

    private static final Logger log = Logger.getLogger(RandomGenerator.class.getName());

    private static List<String> colors =
            Arrays.asList("black", "white", "yellow", "green", "brown", "red", "pink", "purple", "blue");

    public static List<String> getColors() {
        List<String> tempColors = new ArrayList<>(colors);
        return tempColors;
    }

    private static Random random = new Random();

    /**
     * this method generates random color (from existing list of colors)
     */
    public static final String generateColor() {

        log.info("generating random color");

        int i = random.nextInt(colors.size() - 1);

        return colors.get(i);
    }

    /**
     * this method generates random radius for circles in range 1-20
     */
    public static int generateRadius() {

        log.info("generating random radius");

        int i = random.nextInt(20);

        return i + 1;
    }

    /**
     * this method generates random sides for shapes in range 1-20
     */
    public static double generateSide() {

        log.info("generating random side");

        double d = (random.nextDouble()) * (20 - 1) + 1;

        double res = round(d);

        return res;
    }

    /**
     * this method generates random cathetus for triangles in range 1-10
     */
    public static double generateCathetus() {

        log.info("generating random cathetus");

        double d = (random.nextDouble()) * (10 - 1) + 1;

        double res = round(d);

        return res;
    }

    /**
     * this method generates random bases for trapezoids in range 1-15
     */
    public static double generateBases() {

        log.info("generating random base");

        double d = (random.nextDouble()) * (15 - 1) + 1;

        double res = round(d);

        return res;
    }

    /**
     * this method generates random values in range 1-4
     */
    public static int generateShape() {

        log.info("generating random value for shape");

        int i = random.nextInt(4);

        return i + 1;
    }
}
