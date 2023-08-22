package de.telran.mgvozdev.algo.hw2;

public class Test {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            Fraction fraction = new Fraction(2 * (1 - i % 2), (i - 1));
            System.out.println(fraction);
        }
    }
}
