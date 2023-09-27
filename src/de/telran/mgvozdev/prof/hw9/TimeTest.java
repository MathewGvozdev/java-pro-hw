package de.telran.mgvozdev.prof.hw9;

import java.util.*;

/**
 * Array list: 397          Array list: 423         Array list: 388
 * Linked list: 1625        Linked list: 1729       Linked list: 1620
 * Tree set: 1966           Tree set: 1821          Tree set: 1854
 * Hash set: 802            Hash set: 1152          Hash set: 672
 *
 * ArrayList быстрее всего для простых вставок, потому что является динамическим массивом
 * LinkedList имеет быстрые операции вставки и удаления в начале и конце, но в целом время тратится на связи между нодами
 * TreeSet представляет собой бинарное дерево, которое автоматически сортирует элементы по их значению.
 * HashSet - хеш-таблица, поэтому достаточно быстрая вставка уникальных элементов
 */

public class TimeTest {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();

        int elements = 10_000_000;

        System.out.println("Array list: " + testTime(arrayList, elements));
        System.out.println("Linked list: " + testTime(linkedList, elements));
        System.out.println("Tree set: " + testTime(treeSet, elements));
        System.out.println("Hash set: " + testTime(hashSet, elements));
    }

    public static long testTime(Collection<Integer> collection, int elements) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            collection.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
