package com.ve3yn4uk.shapes.impl;

import com.ve3yn4uk.rnd.RandomGenerator;
import com.ve3yn4uk.shapes.abstracrion.AbstractShape;

import static com.ve3yn4uk.utils.MyAppUtils.round;
import static java.lang.Math.sqrt;

public class Triangle extends AbstractShape {

    private double cathetus_1;
    private double cathetus_2;

    public Triangle() {
        this.cathetus_1 = RandomGenerator.generateCathetus();
        this.cathetus_2 = RandomGenerator.generateCathetus();
    }

    public Triangle(double cathetus_1, double cathetus_2) {
        this.cathetus_1 = cathetus_1;
        this.cathetus_2 = cathetus_2;
    }

    public double getCathetus_1() {
        return cathetus_1;
    }

    public double getCathetus_2() {
        return cathetus_2;
    }

    @Override
    public String draw() {

        return "Shape:{Triangle" + ", square: " + getSquare() + ", color: " + getColor() +
                ", cathetus 1: " + getCathetus_1() + ", cathetus 2: " + getCathetus_2() + ", hypotenuse: " +
                getHypotenuse() + '}';
    }

    /**
     * this method returns square of triangle
     */
    @Override
    public double getSquare() {

        double res = round(cathetus_1 * cathetus_2 * 0.5);

        return res;
    }

    /**
     * this method returns hypotenuse of triangle
     */
    public double getHypotenuse() {

        double res = round(sqrt(cathetus_1 * cathetus_1 + cathetus_2 * cathetus_2));

        return res;
    }
}
