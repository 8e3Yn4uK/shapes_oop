package com.ve3yn4uk.shapes.abstracrion;

import com.ve3yn4uk.rnd.RandomGenerator;

/**
 * this class discribes all common attributes & behavior of shapes
 */
public abstract class AbstractShape {

    private String color;

    public AbstractShape() {
        this.color = RandomGenerator.generateColor();
    }

    public abstract String draw();

    public abstract double getSquare();

    protected String getColor() {
        return color;
    }


}
