package com.luizjacomn.observer.subjects;

import com.luizjacomn.observer.observers.Observer;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);
    
    void notifyObservers();
    
}