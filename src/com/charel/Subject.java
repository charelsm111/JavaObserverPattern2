package com.charel;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

    List<IObserver> observerList = new ArrayList<IObserver>();

    private int myValue;

    public int getMyValue() {
        return this.myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        notifyObservers(myValue);
    }

    @Override
    public void register(IObserver iObserver) {
        observerList.add(iObserver);
    }

    @Override
    public void unregister(IObserver iObserver) {
        observerList.remove(iObserver);
    }

    @Override
    public void notifyObservers(int myValue) {
        for (int i=0; i<observerList.size(); i++) {
            observerList.get(i).update(myValue);
        }
    }
}
