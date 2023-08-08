package de.telran.mgvozdev.prof.hw2.shapes;

public class Rectangle extends Shape {

    private int first;
    private int second;

    public Rectangle(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем прямоугольник со сторонами %d, %d%n", first, second);
    }

    @Override
    public double calculateArea() {
        return first * second;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (first + second);
    }
}
