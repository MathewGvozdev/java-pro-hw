package de.telran.mgvozdev.prof.hw5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AlgoTasks {

    public static void main(String[] args) {
        System.out.println(addFive(10));

        int[][] array = fillAndShowTwoDimensionalArray(5);

        System.out.println("Max element: " + findMaxOnSecondaryDiagonal(array));

        createAndPrintArrayByFormula(5);

        printChessBoard();

        System.out.println("Negative numbers: " + countNegativeBelowMainDiagonal(array));

//        inputArray(3);

        int[] arr = {3, 5, 10, 41, 0, 6, 28};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        sumOfTwoArrays(fillAndShowTwoDimensionalArray(5), fillAndShowTwoDimensionalArray(5));
    }

    public static int addFive(int number) {
        return number + 5;
    }

    public static int[][] fillAndShowTwoDimensionalArray(int size) {
        int[][] array = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(100) - 50;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }

    public static int findMaxOnSecondaryDiagonal(int[][] matrix) {
        int maxElement = matrix[0][matrix.length - 1];
        for (int i = 0; i < matrix.length; i++) {
            int columnIndex = matrix.length - 1 - i;
            int element = matrix[i][columnIndex];
            if (element > maxElement) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    public static void createAndPrintArrayByFormula(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = 7 * i - 3 * j;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printChessBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("O "); // Белая клетка
                } else {
                    System.out.print("X "); // Черная клетка
                }
            }
            System.out.println();
        }
    }

    public static int countNegativeBelowMainDiagonal(int[][] matrix) {
        int count = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void inputArray(int size) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[size][size];

        // Ввод элементов матрицы с клавиатуры
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        int maxEven = findMaxEvenElement(array);
        System.out.println("Max even number: " + maxEven);
    }

    private static int findMaxEvenElement(int[][] array) {
        int maxEven = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0 && array[i][j] > maxEven) {
                    maxEven = array[i][j];
                }
            }
        }
        return maxEven;
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static void sumOfTwoArrays(int[][] firstArray, int[][] secondArray) {
        int[][] sumMatrix = new int[5][5];
        System.out.println("Sum array: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sumMatrix[i][j] = firstArray[i][j] + secondArray[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
