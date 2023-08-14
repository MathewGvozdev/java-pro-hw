package de.telran.mgvozdev.prof.hw4.atm;

import de.telran.mgvozdev.prof.hw2.credit.CreditCard;

public class Test {

    public static void main(String[] args) {
        Atm atm = new SimpleAtm(1000);
        CreditCard card = new CreditCard("941020", "1234");
        card.deposit("1234", 100);

        System.out.println("Is card accepted? \n" + atm.takeCard(card, "0000"));
        System.out.println("Is card accepted? \n" + atm.takeCard(card, "1234"));
        System.out.println("Card balance: \n" + atm.checkBalance());
        System.out.println("Card balance: \n" + atm.withdrawCash(30));
        System.out.println("Card balance: \n" + atm.depositCash(50));
    }
}
