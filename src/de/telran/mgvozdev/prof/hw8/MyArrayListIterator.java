package de.telran.mgvozdev.prof.hw8;

import java.util.Iterator;

public class MyArrayListIterator implements Iterator<Integer> {

    private int currentIndex = 0;
    private Integer[] array;
    private int size;

    public MyArrayListIterator(Integer[] array, int size) {
        this.array = array;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < size;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            return array[currentIndex++];
        } else {
            return null;
        }
    }
}
