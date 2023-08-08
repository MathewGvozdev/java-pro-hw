package de.telran.mgvozdev.prof.hw3.showmen;

public class DanceFloor {

    public static void main(String[] args) {
        Danceable firstDancer = new Dancer();
        Danceable secondDancer = new PopDancer();
        Danceable[] dancers = {firstDancer, secondDancer, new PopSinger(), new Dancer(), new Dancer(), new PopDancer()};
        for (Danceable dancer : dancers) {
            dancer.dance();
        }
    }
}
