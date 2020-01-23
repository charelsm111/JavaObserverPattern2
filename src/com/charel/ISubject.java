package com.charel;

public interface ISubject {

    void register(IObserver iObserver);
    void unregister(IObserver iObserver);
    void notifyObservers(int i);
}
