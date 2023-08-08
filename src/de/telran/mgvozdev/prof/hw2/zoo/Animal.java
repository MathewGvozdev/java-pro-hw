package de.telran.mgvozdev.prof.hw2.zoo;

public abstract class Animal {

    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal() {
    }

    public abstract void voice();

    public abstract void eat(String food);

    public abstract void jump();

    public abstract void jump(int length);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
               "name='" + name + '\'' +
               ", color='" + color + '\'' +
               '}';
    }
}
