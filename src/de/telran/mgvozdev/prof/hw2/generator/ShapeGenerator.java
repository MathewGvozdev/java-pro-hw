package de.telran.mgvozdev.prof.hw2.generator;

import de.telran.mgvozdev.prof.hw2.shapes.Circle;
import de.telran.mgvozdev.prof.hw2.shapes.Square;
import de.telran.mgvozdev.prof.hw2.shapes.Triangle;

import java.util.Random;

public class ShapeGenerator {

    public void generate() {
        Random random = new Random();
        int shapeOption = random.nextInt(3);
        if (shapeOption == 0) {
            int radius = random.nextInt(10) + 1;
            new Circle(radius).draw();
        } else if (shapeOption == 1) {
            int size = random.nextInt(10) + 1;
            new Square(size).draw();
        } else if (shapeOption == 2) {
            int first = random.nextInt(10) + 1;
            int second = random.nextInt(10) + 1;
            int third = random.nextInt(10) + 1;
            new Triangle(first, second, third).draw();
        }
    }
}
