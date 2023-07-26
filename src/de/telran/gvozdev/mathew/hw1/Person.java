package de.telran.gvozdev.mathew.hw1;

import java.util.Random;

public class Person {

    public String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public void talk() {
        System.out.println(this.fullName + " говорит");
    }

    public int move() {
        Random steps = new Random();
        return steps.nextInt(101);
    }

    public int getAge() {
        return age;
    }
}
