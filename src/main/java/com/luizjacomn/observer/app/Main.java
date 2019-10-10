package com.luizjacomn.observer.app;

import com.luizjacomn.observer.api.observers.Assinante;
import com.luizjacomn.observer.api.subjects.RevistaInformatica;

public class Main {

    public static void main(String[] args) {
        //poderia receber a nova edicao atraves de um recurso externo
        int novaEdicao = 3;
        RevistaInformatica revistaInformatica = new RevistaInformatica();       
        Assinante assinante = new Assinante(revistaInformatica);
         
        revistaInformatica.setNovaEdicao(novaEdicao);
    }
}