package com.ve3yn4uk.utils;

public class MyAppUtils {


    /**
     * this method round's double value to format x.xx
     */
    public static double round(double d) {

        double res = (double) Math.round(d * 100) / 100;

        return res;
    }
}
