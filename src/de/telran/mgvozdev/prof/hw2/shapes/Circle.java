package de.telran.mgvozdev.prof.hw2.shapes;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Я рисую круг радиусом %d%n", radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
