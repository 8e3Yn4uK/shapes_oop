package com.ve3yn4uk.shapes;

import com.ve3yn4uk.rnd.RandomGenerator;
import com.ve3yn4uk.shapes.abstracrion.AbstractShape;
import com.ve3yn4uk.shapes.impl.Circle;
import com.ve3yn4uk.shapes.impl.Square;
import com.ve3yn4uk.shapes.impl.Trapezoid;
import com.ve3yn4uk.shapes.impl.Triangle;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    public List<AbstractShape> shapes;

    public void createShapes(int i){

         shapes = new ArrayList<>();

        for (int j = 0; j < i; j++) {
            switch (RandomGenerator.generateShape()){
                case 1: shapes.add(new Circle());
                break;
                case 2: shapes.add(new Square());
                break;
                case 3: shapes.add(new Trapezoid());
                break;
                case 4: shapes.add(new Triangle());
                break;
            }
        }

    }
}
