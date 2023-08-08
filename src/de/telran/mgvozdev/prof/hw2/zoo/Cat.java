package de.telran.mgvozdev.prof.hw2.zoo;

public class Cat extends Predator {

    public Cat(String name, String color) {
        super(name, color);
    }

    public Cat() {
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public void jump() {
        System.out.println("Cat jumps");
    }

    @Override
    public void jump(int length) {
        System.out.println("Cat jumps on " + length + "m");
    }

    @Override
    public String toString() {
        return "Cat{" +
               "name='" + getName() + '\'' +
               ", color='" + getColor() + '\'' +
               '}';
    }
}
