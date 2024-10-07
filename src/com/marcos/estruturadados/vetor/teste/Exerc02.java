package com.marcos.estruturadados.vetor.teste;

import com.marcos.estruturadados.vetor.Lista;

public class Exerc02 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<String>(10);

        vetor.adiciona("A");
        vetor.adiciona("C");
        vetor.adiciona("A");
        vetor.adiciona("A");
        vetor.adiciona("A");

        System.out.println(vetor);

        System.out.println(vetor.ultimoIndice("C"));


    }
}
