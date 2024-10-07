package com.marcos.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("A");
        arrayList.add("C");


        System.out.println(arrayList.get(2));

        System.out.println(arrayList);
    }
}
