package org.example;

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
