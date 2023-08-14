package de.telran.mgvozdev.prof.hw4.cards;

public enum Ranks {

    DEUCE("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private final String rank;

    Ranks(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
