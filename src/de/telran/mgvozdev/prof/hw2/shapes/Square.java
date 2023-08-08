package de.telran.mgvozdev.prof.hw2.shapes;

public class Square extends Shape {

    private int size;

    public Square(int size) {
        super("квадрат");
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("рисуем квадрат");
    }

    @Override
    public double calculateArea() {
        return size * size;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * size;
    }
}
