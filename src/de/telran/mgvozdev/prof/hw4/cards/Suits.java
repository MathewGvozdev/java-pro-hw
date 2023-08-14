package de.telran.mgvozdev.prof.hw4.cards;

public enum Suits {

    CLUBS("clubs"),
    DIAMONDS("diamonds"),
    HEARTS("hearts"),
    SPADES("spades");

    private final String name;

    Suits(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
