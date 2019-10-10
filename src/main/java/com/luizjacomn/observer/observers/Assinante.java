package com.luizjacomn.observer.observers;

import com.luizjacomn.observer.subjects.Subject;

public class Assinante implements Observer {

    private String nome;
    
    public Assinante(String nome) {
        this.nome = nome;
    }

    public Assinante(String nome, Subject subject) {
        this.nome = nome;
        subject.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Nome do assinante: " + nome);
    }

}