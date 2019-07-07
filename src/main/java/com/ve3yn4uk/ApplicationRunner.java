package com.ve3yn4uk;

import com.ve3yn4uk.shapes.ShapeFactory;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplicationRunner {

    private static final Logger log = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

        System.out.println("Input quantity of shapes (integer value, > 0)");
        int i = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            i = Integer.parseInt(br.readLine());
            if (i <= 0) throw new IOException("value must be > 0!");
        } catch (IOException e) {
            log.log(Level.ERROR, "Exception: ", e);
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            log.log(Level.ERROR, "Exception: ", e);
            System.out.println("value must be integer!\n" + e.getMessage());
        }

        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.createShapes(i);

        shapeFactory.getShapes().forEach(e -> System.out.println(e.draw()));
    }
}
