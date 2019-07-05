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

        int i = random.nextInt(19);

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
}
