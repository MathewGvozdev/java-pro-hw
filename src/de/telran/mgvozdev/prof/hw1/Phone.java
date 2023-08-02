package de.telran.mgvozdev.prof.hw1;

import java.util.Random;

public class Phone {

    private String number;
    public String model;
    int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {
    }

    public void receiveCall(String incomingName) {
        System.out.println("Звонит " + incomingName);
    }

    public void call(String outgoingName) {
        Random random = new Random();
        boolean respond = random.nextBoolean();
        if (respond) {
            System.out.println("Дозвонился до " + outgoingName);
        } else {
            System.out.println("Абонент " + outgoingName + " не доступен");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
}
