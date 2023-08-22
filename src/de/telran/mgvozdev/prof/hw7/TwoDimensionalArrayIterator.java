package de.telran.mgvozdev.prof.hw7;

import java.util.Iterator;

public class TwoDimensionalArrayIterator implements Iterator<Integer> {

    private Integer[][] array;
    private int currentRow;
    private int currentCol;

    public TwoDimensionalArrayIterator(Integer[][] array) {
        this.array = array;
        this.currentRow = 0;
        this.currentCol = 0;
    }

    @Override
    public boolean hasNext() {
        return currentRow < array.length && currentCol < array[currentRow].length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements to iterate.");
        }
        Integer element = array[currentRow][currentCol];
        currentCol++;
        if (currentCol >= array[currentRow].length) {
            currentCol = 0;
            currentRow++;
        }
        return element;
    }
}
