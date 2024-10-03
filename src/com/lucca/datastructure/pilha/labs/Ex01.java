package com.lucca.datastructure.pilha.labs;

import com.lucca.datastructure.pilha.Pilha;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("digite um numero: ");

            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("Empilhando o número: " + num);
                pilha.empilha(num);
            } else {
                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número impar, desempilhando um elemento da pilha: " + desempilhado);
                }
            }
        }

        System.out.println("Todos os numeros foram lidos. desempilhando numeros da pilha");

        while (!pilha.estaVazia()) {
            System.out.println("desempilhando um elemento da pilha: " + pilha.desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados");
        sc.close();
    }
}
