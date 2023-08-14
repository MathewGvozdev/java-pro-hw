package de.telran.mgvozdev.prof.hw4.alphabet;

public enum Alphabet {

    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

    Alphabet() {
    }

    public int getNumber() {
        return this.ordinal() + 1;
    }
}
