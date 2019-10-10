package com.luizjacomn.observer.api.observers;

import java.util.Observable;
import java.util.Observer;

import com.luizjacomn.observer.api.subjects.RevistaInformatica;

public class Assinante implements Observer {
    
    Observable revistaInformatica;
     
    int edicaoNovaRevista;
     
    public Assinante(Observable revistaInformatica) {
        this.revistaInformatica = revistaInformatica;
        revistaInformatica.addObserver(this);
    }
     
    @Override
    public void update(Observable revistaInfSubject, Object arg1) {
        if (revistaInfSubject instanceof RevistaInformatica) {
            RevistaInformatica revistaInformatica = (RevistaInformatica) revistaInfSubject;
            edicaoNovaRevista = revistaInformatica.getEdicao();
            System.out.println("Atenção, já chegou a mais uma edição da Revista Informatica. " +
                    "Esta é a sua edição número: " + edicaoNovaRevista);
        }
    }   
}