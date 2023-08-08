package de.telran.mgvozdev.prof.hw2.zoo;

public abstract class Predator extends Animal {

    public Predator(String name, String color) {
        super(name, color);
    }

    public Predator() {
    }

    @Override
    public void eat(String food) {
        if ("grass".equalsIgnoreCase(food)) {
            System.out.println("I don't eat it");
        } else {
            System.out.println("I eat meat");
        }
    }
}
