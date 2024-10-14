package com.marcos.estruturadados.lista.teste;

import com.marcos.estruturadados.lista.ListaEncadeada;

public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println(lista);
    }
}
