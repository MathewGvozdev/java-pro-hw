package de.telran.mgvozdev.prof.hw2.credit;

public class CreditCardRunner {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("124124","1234");
        creditCard.setBalance(100);
        creditCard.setCreditLimit(50);
        System.out.println(creditCard);
        creditCard.deposit("1234", 30);
        System.out.println(creditCard);
        creditCard.withdraw("1234", 100);
        System.out.println(creditCard);
        creditCard.withdraw("1234", 60);
        System.out.println(creditCard);
        creditCard.deposit("1234", 40);
        System.out.println(creditCard);
        creditCard.deposit("1234", 40);
        System.out.println(creditCard);
    }
}
