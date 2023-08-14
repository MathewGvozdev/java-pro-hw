package de.telran.mgvozdev.prof.hw4.cards;

import java.util.Random;

public class Deck {

    private final int numberOfCards;
    private final String[] deck;

    public Deck() {
        numberOfCards = Suits.values().length * Ranks.values().length;
        deck = new String[numberOfCards];
    }

    public void init() {
        for (int i = 0; i < Ranks.values().length; i++) {
            for (int j = 0; j < Suits.values().length; j++) {
                deck[Suits.values().length * i + j] = Ranks.values()[i] + " " + Suits.values()[j];
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }

    public void display(int players, int cardsForPlayer) {
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }

    public String[] getDeck() {
        return deck;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }
}
