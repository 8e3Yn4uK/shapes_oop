package com.ve3yn4uk.shapes.impl;

import com.ve3yn4uk.rnd.RandomGenerator;
import com.ve3yn4uk.shapes.abstracrion.AbstractShape;
import com.ve3yn4uk.utils.MyAppUtils;

public class Square extends AbstractShape {

    private double side;

    public Square() {
        super();
        this.side = RandomGenerator.generateSide();
    }

    public double getSide() {
        return side;
    }

    @Override
    public String draw() {

        return "Shape:{Square" + ", square: " + getSquare() + ", color: " + getColor() +
                ", side: " + getSide() + ", perimeter: " + getPerimeter() +
                '}';
    }

    /**
     * this method returns square of our shape :P
     */
    @Override
    public double getSquare() {

        double res = MyAppUtils.round(side * side);

        return res;
    }

    /**
     * this method returns perimeter of our square :P
     */
    public double getPerimeter() {

        double res = MyAppUtils.round(side * 4);

        return res;
    }
}
