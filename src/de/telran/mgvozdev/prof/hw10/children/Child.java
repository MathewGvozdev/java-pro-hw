package de.telran.mgvozdev.prof.hw10.children;

public class Child implements Comparable<Child> {

    private int height;

    public Child(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Child child) {
        return Integer.compare(this.height, child.height);
    }

    @Override
    public String toString() {
        return "Child{" +
               "height=" + height +
               '}';
    }
}
