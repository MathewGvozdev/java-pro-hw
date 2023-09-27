package de.telran.mgvozdev.prof.hw9;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        fillTreeSet(treeSet);

        System.out.println("Closest number <=56: " + treeSet.floor(56));
        System.out.println("Closest number >=70: " + treeSet.ceiling(70));
        System.out.println("Closest number >40: " + treeSet.higher(40));
        System.out.println("Closest number <10: " + treeSet.lower(10));
        System.out.println("Numbers between [10, 30): " + treeSet.subSet(10, true, 30, false));
        System.out.println("Numbers between [30, 40]: " + treeSet.subSet(30, true, 40, true));
        System.out.println("Numbers between (40, 50]: " + treeSet.subSet(40, false, 50, true));
        System.out.println("Numbers less <40: " + treeSet.headSet(40, false));
    }

    private static void fillTreeSet(TreeSet<Integer> treeSet) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            treeSet.add(random.nextInt(101));
        }
    }
}
