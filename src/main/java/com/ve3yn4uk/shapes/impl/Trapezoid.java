package com.ve3yn4uk.shapes.impl;

import com.ve3yn4uk.rnd.RandomGenerator;
import com.ve3yn4uk.shapes.abstracrion.AbstractShape;
import com.ve3yn4uk.utils.MyAppUtils;

public class Trapezoid extends AbstractShape {

    private double base1;
    private double base2;
    private double height;

    public Trapezoid() {
        super();
        this.base1 = RandomGenerator.generateBases();
        this.base2 = RandomGenerator.generateBases();
        this.height = RandomGenerator.generateBases();
    }

    public double getBase1() {
        return base1;
    }

    public double getBase2() {
        return base2;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String draw() {

        return "Shape:{Trapezium" + ", square: " + getSquare() + ", color: " + getColor() +
                ", base 1: " + getBase1() + ", base 2: " + getBase2() + ", height: " +
                getHeight() + ", midline: " + getMidline() + '}';

    }

    /**
     * this method returns square of trapezioid
     */
    @Override
    public double getSquare() {

        double d = (base1 + base2) / 2 * height;

        double res = MyAppUtils.round(d);

        return res;
    }

    /**
     * this method returns midline of trapezoid
     */
    public double getMidline() {

        double d = (base1 + base2) / 2;

        double res = MyAppUtils.round(d);

        return res;
    }
}
