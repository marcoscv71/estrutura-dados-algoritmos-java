package com.marcos.estruturadados.lista;

public class ListaEncadeada<T> {


    private No<T> inicio;
    private No<T> ultimo;

    private int tamanho = 0;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
        this.ultimo = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }


    @Override
    public String toString() {
        return "ListaEncadeada[" +
                "inicio=" + inicio +
                ']';
    }
}
