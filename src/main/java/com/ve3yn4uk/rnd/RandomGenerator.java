package com.ve3yn4uk.rnd;

import com.ve3yn4uk.utils.MyAppUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    private static List<String> colors =
            Arrays.asList("black", "white", "yellow", "green", "brown", "red", "pink", "purple", "blue");

    public static List<String> getColors() {
        List<String> tempColors = colors;
        return tempColors;
    }

    private static Random random = new Random();

    /**
     * this method generates random color (from existing list of colors)
     */
    public static String generateColor() {

        int i = random.nextInt(colors.size() - 1);

        return colors.get(i);
    }

    /**
     * this method generates random radius for circles in range 1-20
     */
    public static int generateRadius() {

        int i = random.nextInt(20);

        return i + 1;
    }

    /**
     * this method generates random sides for shapes in range 1-20
     */
    public static double generateSide() {

        double d = (random.nextDouble()) * (20 - 1) + 1;

        double res = MyAppUtils.round(d);

        return res;
    }

    /**
     * this method generates random cathetus for triangles in range 1-10
     */
    public static double generateCathetus() {

        double d = (random.nextDouble()) * (10 - 1) + 1;

        double res = MyAppUtils.round(d);

        return res;
    }

    /**
     * this method generates random bases for trapezoids in range 1-15
     */
    public static double generateBases() {

        double d = (random.nextDouble()) * (15 - 1) + 1;

        double res = MyAppUtils.round(d);

        return res;
    }

    /**
     * this method generates random values in range 1-4
     */
    public static int generateShape() {

        int i = random.nextInt(4);

        return i + 1;
    }
}
