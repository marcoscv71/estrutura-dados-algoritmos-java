package com.marcos.estruturadados.vetor.teste;

import com.marcos.estruturadados.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.busca("elemento 3"));
        System.out.println(vetor.busca("elemento 4"));
    }
}
