package com.marcos.estruturadados.vetor.teste;

import com.marcos.estruturadados.vetor.Lista;

public class Exerc04 {
    public static void main(String[] args) {

        Lista<String> vetor = new Lista<String>(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println(vetor);

        System.out.println(vetor.obtem(0));
        System.out.println(vetor.obtem(1));
        System.out.println(vetor.obtem(2));
        System.out.println(vetor.obtem(3));
    }
}
