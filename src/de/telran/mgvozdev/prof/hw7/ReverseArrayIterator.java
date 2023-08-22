package de.telran.mgvozdev.prof.hw7;

import java.util.Iterator;

public class ReverseArrayIterator implements Iterator<Integer> {

    private Integer[] array;
    private int currentIndex;

    public ReverseArrayIterator(Integer[] array) {
        this.array = array;
        this.currentIndex = array.length - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements to iterate.");
        }
        Integer element = array[currentIndex];
        currentIndex--;
        return element;
    }
}
