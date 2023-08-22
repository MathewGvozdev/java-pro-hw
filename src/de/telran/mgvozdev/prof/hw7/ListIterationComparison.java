package de.telran.mgvozdev.prof.hw7;

import java.util.*;

public class ListIterationComparison {

    private static long startTime;
    private static long endTime;
    private static long elapsedTime;

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10_000_000; i++) {
            numbers.add(random.nextInt());
        }
        forEachLoop(numbers);
        classicFor(numbers);
        reversedClassicFor(numbers);
        iterator(numbers);
        listIterator(numbers);
    }

    private static void forEachLoop(List<Integer> numbers) {
        startTime = System.currentTimeMillis();
        int tempVal = 0;
        for (int num : numbers) {
            tempVal = num;
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("For-each loop: " + elapsedTime + " ms");
    }

    private static void classicFor(List<Integer> numbers) {
        startTime = System.currentTimeMillis();
        int tempVal = 0;
        for (int i = 0; i < numbers.size(); i++) {
            tempVal = numbers.get(i);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Classic for loop: " + elapsedTime + " ms");
    }

    private static void reversedClassicFor(List<Integer> numbers) {
        startTime = System.currentTimeMillis();
        int tempVal = 0;
        for (int i = numbers.size() - 1; i >= 0; i--) {
            tempVal = numbers.get(i);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Classic for loop (reverse): " + elapsedTime + " ms");
    }

    private static void iterator(List<Integer> numbers) {
        startTime = System.currentTimeMillis();
        int tempVal = 0;
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            tempVal = iterator.next();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Using Iterator: " + elapsedTime + " ms");
    }

    private static void listIterator(List<Integer> numbers) {
        startTime = System.currentTimeMillis();
        int tempVal = 0;
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            tempVal = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Using ListIterator: " + elapsedTime + " ms");
    }
}
