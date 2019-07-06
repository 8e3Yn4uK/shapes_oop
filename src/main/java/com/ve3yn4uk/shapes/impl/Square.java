package com.ve3yn4uk.shapes.impl;

import com.ve3yn4uk.rnd.RandomGenerator;
import com.ve3yn4uk.shapes.abstracrion.AbstractShape;
import org.apache.log4j.Logger;

import static com.ve3yn4uk.utils.MyAppUtils.round;

public class Square extends AbstractShape {

    private static final Logger log = Logger.getLogger(Square.class.getName());

    private double side;

    public Square() {
        log.info("creating new square");
        this.side = RandomGenerator.generateSide();
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String draw() {

        log.info("drawing square");

        return "Shape:{Square" + ", square: " + getSquare() + ", color: " + getColor() +
                ", side: " + getSide() + ", perimeter: " + getPerimeter() +
                '}';
    }

    /**
     * this method returns square of our shape :P
     */
    @Override
    public double getSquare() {

        log.info("calculating square for square");

        double res = round(side * side);

        return res;
    }

    /**
     * this method returns perimeter of our square :P
     */
    public double getPerimeter() {

        log.info("calculating perimeter for square");

        double res = round(side * 4);

        return res;
    }
}
