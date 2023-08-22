package de.telran.mgvozdev.algo.hw2;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        if (numerator == 0) {
            return "0";
        } else if (denominator == 1) {
            return numerator + "";
        } else{
            return numerator + "/" + denominator;
        }
    }
}
