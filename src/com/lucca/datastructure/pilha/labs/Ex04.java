package com.lucca.datastructure.pilha.labs;

import java.util.Stack;

public class Ex04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("The Witcher - Box digital: Série Completa");
        livro1.setAutor("Andrzej Sapkowski");
        livro1.setAnoLancamento(2020);
        livro1.setIsbn("B08MQXN9P6");

        Livro livro2 = new Livro();
        livro2.setNome("Comprada pelo General Alien: Livro único, Alien romance (Guerreiros de Selvaria 1)");
        livro2.setAutor("G. Benevides");
        livro2.setAnoLancamento(2021);
        livro2.setIsbn("B0DH1RBT8J");

        Livro livro3 = new Livro();
        livro3.setNome("Jiraiya: O Novo Império dos Ninjas");
        livro3.setAutor("Chris Tex");
        livro3.setAnoLancamento(2024);
        livro3.setIsbn("B0DBN23CNS");

        Livro livro4 = new Livro();
        livro4.setNome("O Novo Preço da Desonra (mangá volume único)");
        livro4.setAutor("Hiroshi Hirata");
        livro4.setAnoLancamento(2023);
        livro4.setIsbn("B0CGFBJQ6T");

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

        System.out.println("Empilhando livros na pilha: ");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);

        System.out.println(pilha.size() + " livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        System.out.println("Desempilhando livros da pilhas: ");

        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando livross: " + pilha.pop());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.isEmpty());
    }
}
