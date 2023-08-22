package de.telran.mgvozdev.prof.hw6;

import java.util.ArrayList;
import java.util.List;

public class ListTestLevelTwo {

    public static void main(String[] args) {
        ArrayList<String> brokers = new ArrayList<>(List.of(
                "Rooney",
                "Messi",
                "Ronaldo",
                "Van Persie",
                "Neymar",
                "Ibrahimovic",
                "Evans"));
        swapSurnames(brokers);

        ArrayList<Integer> list = new ArrayList<>(List.of(2, 4, 5, 6, 8, 10, 13, 15, 16, 19, 20));
        System.out.println(binarySearch(list, 16));
    }

    public static void swapSurnames(List<String> brokers) {
        int size = brokers.size();
        for (int i = 0; i < size / 2; i++) {
            String temp = brokers.get(i);
            brokers.set(i, brokers.get(size - 1 - i));
            brokers.set(size - 1 - i, temp);
        }
        System.out.println(brokers);
    }

    public static int binarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = list.get(mid);
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
