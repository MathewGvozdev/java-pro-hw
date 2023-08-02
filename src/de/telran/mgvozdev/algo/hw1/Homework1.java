package de.telran.mgvozdev.algo.hw1;

public class Homework1 {

    public static void main(String[] args) {
        int[] array = new int[]{
                1, 5, 8, 10, 3, 41, 29
        };
        System.out.println(findMaxValue(array));

        String str1 = "borrow or rob";
        String str2 = "just a word";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }

    // Напишите функцию, которая принимает массив чисел и возвращает наибольшее число из этого массива.
    public static int findMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    // Напишите функцию, которая принимает строку и возвращает true, если строка является палиндромом
    // (читается одинаково слева направо и справа налево), и false в противном случае.
    public static boolean isPalindrome(String str) {
        str = str.replaceAll(" ", "");
        int leftIndex = 0;
        int rightIndex = str.length() - 1;
        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false;
            } else {
                leftIndex++;
                rightIndex--;
            }
        }
        return true;
    }
}
