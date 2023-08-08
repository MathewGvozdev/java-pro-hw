package de.telran.mgvozdev.prof.hw2.zoo;

public class Dog extends Predator {

    public Dog(String name, String color) {
        super(name, color);
    }

    public Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public void jump() {
        System.out.println("Dog jumps");
    }

    @Override
    public void jump(int length) {
        System.out.println("Dog jumps on " + length + "m");
    }

    @Override
    public String toString() {
        return "Dog{" +
               "name='" + getName() + '\'' +
               ", color='" + getColor() + '\'' +
               '}';
    }
}
