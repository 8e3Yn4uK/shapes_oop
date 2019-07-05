package com.ve3yn4uk.shapes;

import com.ve3yn4uk.rnd.ColorGenerator;

/**
 * this class discribes all common fields and attributes of shapes
 */
public class AbstractShape {

    private String color;

    public AbstractShape(String color) {
        this.color = ColorGenerator.generateColor();
    }
}
