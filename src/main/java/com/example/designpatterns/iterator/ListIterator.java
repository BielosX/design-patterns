package com.example.designpatterns.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator<T> {
    private final List<T> list;
    private int index;

    public ListIterator(List<T> list) {
        this.list = list;
        index = 0;
    }

    public boolean hasNext() {
        return index < list.size();
    }

    public T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int current = this.index;
        this.index++;
        return list.get(current);
    }

    public void add(T value) {
        list.add(index, value);
        this.index++;
    }

    public void remove() {
        list.remove(index - 1);
        this.index--;
    }
}
