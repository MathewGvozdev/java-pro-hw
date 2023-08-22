package de.telran.mgvozdev.prof.hw6;

import java.util.*;

public class ListTestLevelOne {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        addMillionElementsToList(arrayList);
        addMillionElementsToList(linkedList);

        takeRandomElement(arrayList);
        takeRandomElement(linkedList);

        getAverageFromListWithInput();

        List<Integer> numbers = new ArrayList<>(List.of(2, 5, 10, -4, 0, 41, 52, 3, 9, 6, 19));
        sortByInsertion(numbers);
        System.out.println(numbers);

        ArrayList<String> products1 = new ArrayList<>(List.of("ProdA", "ProdB", "ProdC", "ProdA", "ProdD", "ProdA", "ProdA"));
        ArrayList<String> products2 = new ArrayList<>(List.of("ProdA", "ProdB", "ProdC", "ProdD", "ProdF"));
        deleteIfRepeatedProduct(products1);
        deleteIfRepeatedProduct(products2);
    }

    public static void addMillionElementsToList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        long fillTime = endTime - startTime;
        System.out.println("Fill time: " + fillTime);
    }

    public static void takeRandomElement(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            int randomIndex = random.nextInt(list.size());
            int value = list.get(randomIndex);
        }
        long endTime = System.currentTimeMillis();
        long takeTime = endTime - startTime;
        System.out.println("Take time: " + takeTime);
    }

    public static double getAverageFromListWithInput() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            list.add(number);
        }
        for (int number : list) {
            System.out.print(number + ", ");
        }
        System.out.println();
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        double average = (double) sum / list.size();
        System.out.println("Average: " + average);
        return average;
    }

    public static void sortByInsertion(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int max = list.get(0);
            int maxIndex = 0;
            for (int j = 0; j < list.size() - i; j++) {
                if (max < list.get(j)) {
                    max = list.get(j);
                    maxIndex = j;
                }
            }
            int tmp = list.get(list.size() - 1 - i);
            list.set(list.size() - 1 - i, max);
            list.set(maxIndex, tmp);
        }
    }

    public static boolean deleteIfRepeatedProduct(List<String> products) {
        String firstProduct = products.get(0);
        List<String> updatedProducts = new ArrayList<>();
        updatedProducts.add(firstProduct);
        for (String product : products) {
            if (!product.equals(firstProduct)) {
                updatedProducts.add(product);
            }
        }
        if (updatedProducts.size() < products.size()) {
            System.out.println("Similar " + firstProduct + " are deleted.");
        } else {
            System.out.println("No repeats " + firstProduct);
        }
        System.out.println(updatedProducts);
        return updatedProducts.size() < products.size();
    }
}
