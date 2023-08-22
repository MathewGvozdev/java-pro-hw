package de.telran.mgvozdev.prof.hw7;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Integer> {

    private Integer[] array;
    private int currentIndex;

    public ArrayIterator(Integer[] array) {
        this.array = array;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements to iterate.");
        }
        Integer element = array[currentIndex];
        currentIndex++;
        return element;
    }
}
