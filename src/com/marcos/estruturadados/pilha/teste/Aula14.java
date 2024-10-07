package com.marcos.estruturadados.pilha.teste;

import com.marcos.estruturadados.pilha.Pilha;

public class Aula14 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        for(int i=1; i <= 10; i++) {
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());

        pilha.empilha(11);
        System.out.println(pilha);
    }
}
