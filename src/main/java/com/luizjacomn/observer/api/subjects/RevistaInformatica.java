package com.luizjacomn.observer.api.subjects;

import java.util.Observable;

public class RevistaInformatica extends Observable {

    private int edicao;

    public void setNovaEdicao(int novaEdicao) {
        this.edicao = novaEdicao;

        setChanged();
        notifyObservers();
    }

    public int getEdicao() {
        return this.edicao;
    }
}