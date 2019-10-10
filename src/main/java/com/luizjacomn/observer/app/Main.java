package com.luizjacomn.observer.app;

import com.luizjacomn.observer.observers.Assinante;
import com.luizjacomn.observer.subjects.RevistaAutomoveis;

public class Main {

    public static void main(String[] args) {
        RevistaAutomoveis revistaAutomoveis = new RevistaAutomoveis();
        Assinante assinante = new Assinante("Lucas", revistaAutomoveis);
        Assinante assinante2 = new Assinante("Rafa", revistaAutomoveis);
        Assinante assinante3 = new Assinante("Carlos");
        
        revistaAutomoveis.publicarArtigo("Este é um novo artigo");
    }

}