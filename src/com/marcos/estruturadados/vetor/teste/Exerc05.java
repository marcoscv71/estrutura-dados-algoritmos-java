package com.marcos.estruturadados.vetor.teste;

import com.marcos.estruturadados.vetor.Lista;

public class Exerc05 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<String>(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println(vetor);

        vetor.limpar();

        System.out.println(vetor);

        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.limpar();

        System.out.println(vetor);
    }
}
