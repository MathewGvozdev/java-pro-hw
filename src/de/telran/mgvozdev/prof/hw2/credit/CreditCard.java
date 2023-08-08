package de.telran.mgvozdev.prof.hw2.credit;

public class CreditCard {

    private final String number;
    private final String pinCode;
    private int balance;
    private int creditLimit;
    private int debt;

    public CreditCard(String number, String pinCode) {
        this.number = number;
        this.pinCode = pinCode;
        this.balance = 0;
        this.debt = 0;
    }

    public boolean deposit(String pinCode, int deposit) {
        if (!this.pinCode.equals(pinCode)) {
            return false;
        } else {
            int initialDebt = debt;
            if (debt > 0) {
                debt -= deposit;
                balance -= debt;
                if (balance < 0) {
                    balance = 0;
                }
                creditLimit = creditLimit + (initialDebt - debt - balance);
                if (debt < 0) {
                    debt = 0;
                }
            } else if (debt == 0) {
                balance += deposit;
            }
            return true;
        }
    }

    public boolean withdraw(String pinCode, int withdrawal) {
        if (!this.pinCode.equals(pinCode)) {
            return false;
        } else {
            int initialBalance = balance;
            int initialDebt = debt;
            int initialCreditLimit = creditLimit;
            balance -= withdrawal;
            if (balance < 0) {
                debt -= balance;
                balance = 0;
                creditLimit -= debt;
                if (creditLimit < 0) {
                    balance = initialBalance;
                    debt = initialDebt;
                    creditLimit = initialCreditLimit;
                    return false;
                }
            }
            return true;
        }
    }

    public String getNumber() {
        return number;
    }

    public String getPinCode() {
        return pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
               "number='" + number + '\'' +
               ", pinCode='" + pinCode + '\'' +
               ", balance=" + balance +
               ", creditLimit=" + creditLimit +
               ", debt=" + debt +
               '}';
    }
}
