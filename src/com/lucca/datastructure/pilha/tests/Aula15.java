package com.lucca.datastructure.pilha.tests;

import com.lucca.datastructure.pilha.Pilha;

public class Aula15 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazia());

        pilha.empilha(1);

        System.out.println(pilha.estaVazia());
    }
}
