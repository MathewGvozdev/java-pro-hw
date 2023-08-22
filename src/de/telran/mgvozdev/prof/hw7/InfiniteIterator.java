package de.telran.mgvozdev.prof.hw7;

import java.util.Iterator;
import java.util.List;

public class InfiniteIterator implements Iterator<String> {

    private List<String> elements;
    private int currentIndex;

    public InfiniteIterator(List<String> elements) {
        if (elements.isEmpty()) {
            throw new IllegalArgumentException("List of elements must not be empty.");
        }
        this.elements = elements;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public String next() {
        String element = elements.get(currentIndex);
        currentIndex = (currentIndex + 1) % elements.size();
        return element;
    }
}
