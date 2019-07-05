package com.ve3yn4uk.shapes;

import com.ve3yn4uk.rnd.RandomGenerator;
import com.ve3yn4uk.utils.MyAppUtils;

public class Circle extends AbstractShape {

    private int radius;

    public Circle() {
        super();
        this.radius = RandomGenerator.generateRadius();
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String draw() {

        return "Shape:{Circle" + ", square: " + getSquare() + ", color: " + getColor() +
                ", radius: " + radius + ", circuit length: " + getCircuitLength() +
                '}';
    }

    /**
     * this method returns square of circle
     */
    @Override
    public double getSquare() {

        double sqr = Math.PI * radius * radius;

        double res = MyAppUtils.round(sqr);

        return res;
    }

    /**
     * this method returns circuit length of circle
     */
    public double getCircuitLength() {

        double sl = Math.PI * radius * 2;

        double res = MyAppUtils.round(sl);

        return res;

    }

}
