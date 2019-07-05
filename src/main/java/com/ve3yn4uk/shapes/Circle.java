package com.ve3yn4uk.shapes;

import com.ve3yn4uk.rnd.RandomGenerator;

public class Circle extends AbstractShape {

    private int radius;

    public Circle() {
        super();
        this.radius = RandomGenerator.generateRadius();
    }

    @Override
    public String draw() {

        return "Shape:{Circle" + ", square: " + getSquare() + ", color: " + getColor() +
                ", radius: " + radius + ", circuit length: " + getCircuitLength() +
                '}';
    }

    /**
     * this method returns square of circle in format x.xx
     */
    @Override
    public double getSquare() {

        double sqr = Math.PI * radius * radius;

        double res = (double) Math.round(sqr * 100) / 100;

        return res;
    }

    /**
     * this method returns circuit length of circle in format x.xx
     */
    public double getCircuitLength() {

        double sl = Math.PI * radius * 2;

        double res = (double) Math.round(sl * 100) / 100;

        return res;

    }

    public int getRadius() {
        return radius;
    }

}
