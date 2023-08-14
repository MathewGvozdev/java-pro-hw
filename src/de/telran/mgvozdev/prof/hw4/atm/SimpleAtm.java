package de.telran.mgvozdev.prof.hw4.atm;

import de.telran.mgvozdev.prof.hw2.credit.CreditCard;

public class SimpleAtm implements Atm {

    private int cashLimit;
    private CreditCard card;

    public SimpleAtm(int cashLimit) {
        this.cashLimit = cashLimit;
    }

    @Override
    public boolean takeCard(CreditCard card, String pinCode) {
        if (card.getPinCode().equals(pinCode)) {
            this.card = card;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public CreditCard returnCard() {
        CreditCard operatedCard = this.card;
        if (operatedCard != null) {
            this.card = null;
            return operatedCard;
        } else {
            System.out.println("The card isn't inserted");
            return null;
        }
    }

    @Override
    public int checkBalance() {
        if (this.card != null) {
            return this.card.getBalance();
        } else {
            System.out.println("Insert a credit card");
            return -1;
        }
    }

    @Override
    public int withdrawCash(int withdrawal) {
        if (card != null) {
            if (card.getBalance() >= withdrawal && withdrawal <= cashLimit) {
                int balance = card.getBalance() - withdrawal;
                card.setBalance(balance);
                cashLimit -= withdrawal;
                return balance;
            } else {
                System.out.println("Insert other withdrawal");
                return -1;
            }
        } else {
            System.out.println("Insert a credit card");
            return -1;
        }
    }

    @Override
    public int depositCash(int deposit) {
        if (card != null) {
            int balance = card.getBalance() + deposit;
            card.setBalance(balance);
            cashLimit += deposit;
            return balance;
        } else {
            System.out.println("Insert a credit card");
            return -1;
        }
    }

    public int getCashLimit() {
        return cashLimit;
    }

    public void setCashLimit(int cashLimit) {
        this.cashLimit = cashLimit;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }
}
