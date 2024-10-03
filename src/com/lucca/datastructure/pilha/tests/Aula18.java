package com.lucca.datastructure.pilha.tests;

import com.lucca.datastructure.pilha.Pilha;

import java.util.Stack;

public class Aula18 {
    public static void main(String[] args) {
        Pilha <Integer> pilha = new Pilha<Integer>();

        // API do java q é a mesma coisa que o pilha da estrutura de dados
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack);

        System.out.println(stack.peek()); // espia o ultimo elemento da pilha

        System.out.println(stack.pop()); // seria o desempilhar

        System.out.println(stack);
    }
}
