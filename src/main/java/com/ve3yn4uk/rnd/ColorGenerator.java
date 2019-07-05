package com.ve3yn4uk.rnd;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ColorGenerator {

    private static List<String> colors =
            Arrays.asList("black", "white", "yellow", "green", "brown", "red", "pink", "purple", "blue");

    public static List<String> getColors() {
        return colors;
    }

    /**
     * this method generates random color (from existing list of colors)
     */
    public static String generateColor() {

        Random random = new Random(LocalTime.now().getSecond());

        int i = random.nextInt(colors.size() - 1);

        return colors.get(i);
    }
}
