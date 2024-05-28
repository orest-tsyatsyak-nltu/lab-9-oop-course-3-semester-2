package org.example;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private final List<String> state;

    public Memento(List<String> state) {
        this.state = new ArrayList<>(state);
    }

    public List<String> getState() {
        return state;
    }
}
