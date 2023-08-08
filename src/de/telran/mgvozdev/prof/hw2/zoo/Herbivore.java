package de.telran.mgvozdev.prof.hw2.zoo;

public abstract class Herbivore extends Animal {

    public Herbivore(String name, String color) {
        super(name, color);
    }

    public Herbivore() {
    }

    @Override
    public void eat(String food) {
        if ("meat".equalsIgnoreCase(food)) {
            System.out.println("I don't eat it");
        } else {
            System.out.println("I eat grass");
        }
    }
}
