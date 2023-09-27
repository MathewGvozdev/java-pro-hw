package de.telran.mgvozdev.prof.hw9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);

        System.out.println("Input arrayList: " + list);
        removeRepeatingElements(list);
        System.out.println("Output arrayList: " + list);

        List<Integer> listWithRandoms = new ArrayList<>();
        fillWithRandoms(listWithRandoms);
        System.out.println(listWithRandoms);
        System.out.println("Unique elements: " + countUniqueElements(listWithRandoms));

        System.out.println("Duplicated elements: " + countDuplicatedElements(listWithRandoms));
    }

    private static int countDuplicatedElements(List<Integer> list) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicatedNumbers = new HashSet<>();
        for (Integer number : list) {
            if (!uniqueNumbers.add(number)) {
                duplicatedNumbers.add(number);
            }
        }
        return duplicatedNumbers.size();
    }

    private static void fillWithRandoms(List<Integer> list) {
        for (int i = 0; i < 100; i++) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            list.add(randomNumber);
        }
    }

    private static int countUniqueElements(List<Integer> list) {
        HashSet<Integer> uniqueNumbersSet = new HashSet<>(list);
        return uniqueNumbersSet.size();
    }

    private static void removeRepeatingElements(List<Integer> numbersList) {
        HashSet<Integer> uniqueNumbersSet = new HashSet<>(numbersList);
        numbersList.clear();
        numbersList.addAll(uniqueNumbersSet);
    }
}
