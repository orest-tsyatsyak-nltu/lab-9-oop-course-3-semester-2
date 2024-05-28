package org.example;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        if (index >= 0 && index < mementoList.size()) {
            return mementoList.get(index);
        }
        return null;
    }

    public Memento getLastMemento() {
        if (!mementoList.isEmpty()) {
            return mementoList.getLast();
        }
        return null;
    }
}
