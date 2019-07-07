package com.ve3yn4uk.shapes.impl;

import com.ve3yn4uk.rnd.RandomGenerator;
import com.ve3yn4uk.shapes.abstracrion.AbstractShape;
import com.ve3yn4uk.shapes.abstracrion.ITrapezoid;
import org.apache.log4j.Logger;

import static com.ve3yn4uk.utils.MyAppUtils.round;

public class Trapezoid extends AbstractShape implements ITrapezoid {

    private static final Logger log = Logger.getLogger(Trapezoid.class.getName());

    private double base1;
    private double base2;
    private double height;

    public Trapezoid() {
        log.info("creating new trapezoid");
        this.base1 = RandomGenerator.generateBases();
        this.base2 = RandomGenerator.generateBases();
        this.height = RandomGenerator.generateBases();
    }

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
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

        log.info("drawing trapezoid");

        return "Shape:{Trapezoid" + ", square: " + getSquare() + ", color: " + getColor() +
                ", base 1: " + getBase1() + ", base 2: " + getBase2() + ", height: " +
                getHeight() + ", midline: " + getMidline() + '}';
    }

    /**
     * this method returns square of trapezioid
     */
    @Override
    public double getSquare() {

        log.info("calculating square for trapezoid");

        double res = round((base1 + base2) / 2 * height);

        return res;
    }

    /**
     * this method returns midline of trapezoid
     */
    @Override
    public double getMidline() {

        log.info("calculating midline for trapezoid");

        double res = round((base1 + base2) / 2);

        return res;
    }
}
