package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Originator {
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
