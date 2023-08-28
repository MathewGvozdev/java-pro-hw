package de.telran.mgvozdev.algo.hw3;

/**
 * Написать метод, который принимает число, в качестве параметра, а возвращает кол-во единиц этого числа в бинарном виде.
 * Например: число 255 в бинарном виде выглядит как 11111111. Тогда
 * func(int a) {
 * если а = 255 то result = 8 (тк 8 единиц)
 * }
 *
 * ну и так далее.
 * Использовать при решении побитовые операторы
 */

public class Homework3 {

    public static void main(String[] args) {
        int num = 4440;
        int result = countOnesInBinary(num);
        String bin = Integer.toBinaryString(num);
        System.out.println(num + " : " + bin + " : " + result);
    }

    public static int countOnesInBinary(int num) {
        int count = 0;
        while (num > 0) {
            int lowOrderBit = num & 1;
            if (lowOrderBit == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}
