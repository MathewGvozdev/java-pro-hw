package de.telran.mgvozdev.prof.hw9;

import java.util.Objects;

public class Window {

    private final double weight;
    private final double width;
    private final double height;
    private final String glassType;

    public Window(double weight, double width, double height, String glassType) {
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.glassType = glassType;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getGlassType() {
        return glassType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return Double.compare(window.weight, weight) == 0 && Double.compare(window.width, width) == 0 && Double.compare(window.height, height) == 0 && Objects.equals(glassType, window.glassType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, width, height, glassType);
    }

    @Override
    public String toString() {
        return "Window{" +
               "weight=" + weight +
               ", width=" + width +
               ", height=" + height +
               ", glassType='" + glassType + '\'' +
               '}';
    }
}
