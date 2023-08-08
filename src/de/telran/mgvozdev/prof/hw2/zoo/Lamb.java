package de.telran.mgvozdev.prof.hw2.zoo;

public class Lamb extends Herbivore {

    public Lamb(String name, String color) {
        super(name, color);
    }

    public Lamb() {
    }

    @Override
    public void voice() {
        System.out.println("Bleat");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public void jump() {
        System.out.println("Lamb jumps");
    }

    @Override
    public void jump(int length) {
        System.out.println("Lamb jumps on " + length + "m");
    }

    @Override
    public String toString() {
        return "Lamb{" +
               "name='" + getName() + '\'' +
               ", color='" + getColor() + '\'' +
               '}';
    }
}
