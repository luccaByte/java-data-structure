package com.lucca.datastructure.vetor.tests;

import com.lucca.datastructure.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1"); 
        vetor.adiciona("elemento 2"); 
        vetor.adiciona("elemento 3");

        System.out.println(vetor.busca("Elemento 1")); // retorna -1
        System.out.println(vetor.busca("elemento 4")); // retorna -1
    }
}
