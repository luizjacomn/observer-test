package com.luizjacomn.observer.subjects;

import java.util.HashSet;
import java.util.Set;

import com.luizjacomn.observer.observers.Observer;

public class RevistaAutomoveis implements Subject {

    private Set<Observer> observers = new HashSet<>();
    
    public void publicarArtigo(String texto) {
        System.out.println("Texto do artigo: " + texto);
        
        notifyObservers();
    }
    
    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

}