package com.lucca.datastructure.vetor.labs;

import com.lucca.datastructure.vetor.Lista;

public class Ex05 {
    public static void main(String[] args) {

        // com o metodo já existente da classe Arraylist
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);

        arrayList.clear();

        System.out.println(arrayList);

        // na mao
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);

        lista.limpar();

        System.out.println(lista);
    }
}
