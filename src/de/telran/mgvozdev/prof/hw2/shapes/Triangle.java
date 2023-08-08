package de.telran.mgvozdev.prof.hw2.shapes;

public class Triangle extends Shape {

    private int first;
    private int second;
    private int third;

    public Triangle(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем треугольник со сторонами %d, %d, %d%n", first, second, third);
    }

    @Override
    public double calculateArea() {
        double p = (double) (first + second + third) / 2;
        return Math.sqrt(p * (p - first) * (p - second) * (p - third));
    }

    @Override
    public double calculatePerimeter() {
        return first + second + third;
    }
}
