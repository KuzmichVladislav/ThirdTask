package com.company.task3.observer;

public interface ConeObservable {

    void attach(ConeObserver observer);

    void detach(ConeObserver observer);

    void notifyObserver();

}
