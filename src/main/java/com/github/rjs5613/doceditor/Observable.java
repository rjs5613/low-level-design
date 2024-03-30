package com.github.rjs5613.doceditor;

import java.util.HashSet;
import java.util.Set;

public abstract class Observable {

    private final Set<Observer> observers;

    protected Observable() {
        observers = new HashSet<>();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    final void notifyObservers() {
        observers.forEach(o -> o.update(this));
    }

}
