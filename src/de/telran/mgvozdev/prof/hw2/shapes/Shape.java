package de.telran.mgvozdev.prof.hw2.shapes;

public abstract class Shape {

    protected String type;

    public Shape(String type) {
        this.type = type;
    }

    public Shape() {
    }

    public abstract void draw();

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String getType() {
        return type;
    }
}
