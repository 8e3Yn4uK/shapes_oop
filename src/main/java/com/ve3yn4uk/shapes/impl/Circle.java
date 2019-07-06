package com.ve3yn4uk.shapes.impl;

import com.ve3yn4uk.rnd.RandomGenerator;
import com.ve3yn4uk.shapes.abstracrion.AbstractShape;

import static java.lang.Math.PI;
import static com.ve3yn4uk.utils.MyAppUtils.round;

public class Circle extends AbstractShape {

    private int radius;

    public Circle() {
        this.radius = RandomGenerator.generateRadius();
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String draw() {

        return "Shape:{Circle" + ", square: " + getSquare() + ", color: " + getColor() +
                ", radius: " + getRadius() + ", circuit length: " + getCircuitLength() +
                '}';
    }

    /**
     * this method returns square of circle
     */
    @Override
    public double getSquare() {

        double res = round(PI * radius * radius);

        return res;
    }

    /**
     * this method returns circuit length of circle
     */
    public double getCircuitLength() {

        double res = round(PI * radius * 2);

        return res;
    }

}
