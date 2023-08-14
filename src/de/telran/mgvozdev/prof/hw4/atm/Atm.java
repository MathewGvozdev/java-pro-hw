package de.telran.mgvozdev.prof.hw4.atm;

import de.telran.mgvozdev.prof.hw2.credit.CreditCard;

public interface Atm {

    boolean takeCard(CreditCard card, String pinCode);

    CreditCard returnCard();

    int checkBalance();

    int withdrawCash(int cash);

    int depositCash(int deposit);
}
