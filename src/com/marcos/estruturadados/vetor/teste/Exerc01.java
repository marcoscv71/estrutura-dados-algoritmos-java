package com.marcos.estruturadados.vetor.teste;

import com.marcos.estruturadados.vetor.Lista;

public class Exerc01 {
    public static void main(String[] args) {

        Lista<String> vetor = new Lista<String>(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println(vetor);

        boolean existe = vetor.contem("D");

        System.out.println(existe);
    }
}
