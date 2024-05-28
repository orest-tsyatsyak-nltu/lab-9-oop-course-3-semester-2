package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Memento {
    private final List<String> state;

    public Memento(List<String> state) {
        this.state = new ArrayList<>(state);
    }

    public List<String> getState() {
        return state;
    }
}

class Originator {
    private List<String> words = new ArrayList<>();

    Random random = new Random();

    public void generateWord() {
        String word = getRandomWord();
        words.add(word);
        System.out.println("Generated word: " + word);
    }

    public Memento save() {
        return new Memento(words);
    }

    public void restore(Memento memento) {
        words = memento.getState();
        System.out.println("Restored state: " + words);
    }

    private String getRandomWord() {
        String[] randomWords = {
                "agony",
                "tune",
                "chaos",
                "dream",
                "collection",
                "butterfly",
                "achievement",
                "man",
                "supply",
                "discrimination",
                "ladder",
                "trance",
                "bury",
                "crevice",
                "dress",
                "farewell",
                "representative",
                "chorus",
                "superior",
                "payment"
        };
        return randomWords[random.nextInt(randomWords.length)];
    }
}

class Caretaker {
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

public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.generateWord();
        caretaker.addMemento(originator.save());

        originator.generateWord();
        caretaker.addMemento(originator.save());

        originator.generateWord();
        caretaker.addMemento(originator.save());

        originator.restore(caretaker.getMemento(0));

        originator.restore(caretaker.getMemento(1));

        System.out.println(caretaker.getLastMemento().getState());
    }
}
