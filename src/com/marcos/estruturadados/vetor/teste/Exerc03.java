package com.marcos.estruturadados.vetor.teste;

import com.marcos.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exerc03 {
    public static void main(String[] args) {

        Lista<String> vetor = new Lista<String>(10);

        vetor.adiciona("A");
        vetor.adiciona("C");
        vetor.adiciona("A");
        vetor.adiciona("A");
        vetor.adiciona("C");


        vetor.remove("C");

        System.out.println(vetor);
    }
}
