package de.telran.mgvozdev.prof.hw2.zoo;

public class Cow extends Herbivore {

    public Cow(String name, String color) {
        super(name, color);
    }

    public Cow() {
    }

    @Override
    public void voice() {
        System.out.println("Moo");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public void jump() {
        System.out.println("Cow jumps");
    }

    @Override
    public void jump(int length) {
        System.out.println("Cow jumps on " + length + "m");
    }

    @Override
    public String toString() {
        return "Cow{" +
               "name='" + getName() + '\'' +
               ", color='" + getColor() + '\'' +
               '}';
    }
}
