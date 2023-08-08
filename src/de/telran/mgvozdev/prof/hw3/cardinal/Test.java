package de.telran.mgvozdev.prof.hw3.cardinal;

public class Test {

    public static void main(String[] args) {
        CardinalPoints south = CardinalPoints.valueOf("SOUTH");
        System.out.println(south);
        System.out.println(CardinalPoints.NORTH.name());
        System.out.println(CardinalPoints.WEST.ordinal());
    }
}
