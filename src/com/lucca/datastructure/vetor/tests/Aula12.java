package com.lucca.datastructure.vetor.tests;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");
        
        if (existe) {
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento nao existe no array");
        }
        
        int pos = arrayList.indexOf("D");

        if (pos > -1) {
            System.out.println("Elemento existe no array" + pos);
        } else {
            System.out.println("Elemento nao existe no array" + pos);
        }

        System.out.println(arrayList.get(2));

        arrayList.remove(0); // remove por indice
        arrayList.remove("B"); // ou por objeto

        System.out.println(arrayList);

        System.out.println(arrayList.size()); // retorna o tamanho do array

    }
}
