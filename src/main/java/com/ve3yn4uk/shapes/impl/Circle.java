package com.ve3yn4uk.shapes.impl;

import com.ve3yn4uk.rnd.RandomGenerator;
import com.ve3yn4uk.shapes.abstracrion.AbstractShape;
import com.ve3yn4uk.shapes.abstracrion.ICircle;
import org.apache.log4j.Logger;

import static java.lang.Math.PI;
import static com.ve3yn4uk.utils.MyAppUtils.round;

public class Circle extends AbstractShape implements ICircle {

    private static final Logger log = Logger.getLogger(Circle.class.getName());

    private int radius;

    public Circle() {
        log.info("creating new circle");
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

        log.info("drawing circle");

        return "Shape:{Circle" + ", square: " + getSquare() + ", color: " + getColor() +
                ", radius: " + getRadius() + ", circuit length: " + getCircuitLength() +
                '}';
    }

    /**
     * this method returns square of circle
     */
    @Override
    public double getSquare() {

        log.info("calculating square for circle");

        double res = round(PI * radius * radius);

        return res;
    }

    /**
     * this method returns circuit length of circle
     */
    @Override
    public double getCircuitLength() {

        log.info("calculating circuit length for circle");

        double res = round(PI * radius * 2);

        return res;
    }

}
