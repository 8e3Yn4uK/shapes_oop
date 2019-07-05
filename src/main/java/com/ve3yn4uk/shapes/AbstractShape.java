package com.ve3yn4uk.shapes;

import com.ve3yn4uk.rnd.RandomGenerator;

/**
 * this class discribes all common fields and attributes of shapes
 */
public abstract class AbstractShape {

    private String color;

    public AbstractShape() {
        this.color = RandomGenerator.generateColor();
    }

    public abstract String draw();

    public abstract double getSquare();

    public String getColor(){
        return color;
    }
}
