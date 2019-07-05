package com.ve3yn4uk;

import com.ve3yn4uk.shapes.ShapeFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplicationRunner {

    public static void main(String[] args) {

        System.out.println("Input quantity of shapes (integer value, > 0)");
        int i = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            i = Integer.parseInt(br.readLine());
            if (i <= 0) throw new IOException("value must be > 0!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.createShapes(i);

        shapeFactory.shapes.forEach(e -> System.out.println(e.draw()));
    }
}
