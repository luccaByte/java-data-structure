package com.lucca.datastructure.pilha.labs;

import com.lucca.datastructure.pilha.Pilha;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        for (int i = 1; i <=10; i++) {
            System.out.println("Entro com o numero:");
            int num = sc.nextInt();

            if (num == 0) {
                // PILHA PAR
                Integer desempilhado = par.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par vazia");
                } else {
                    System.err.println("DESEMPILHANDO NUMERO ZERO DA PILHA PAR");
                }

                // PILHA IMPAR
                desempilhado = impar.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha impar vazia");
                } else {
                    System.err.println("DESEMPILHANDO NUMERO ZERO DA PILHA IMPAR");
                }
            } else if (num % 2 == 0) {
                System.out.println("Numero par, empilhando na pilha dos pares: " + num);
                par.empilha(num);
            } else {
                System.out.println("Numero impar, empilhando na pilha dos impares: " + num);
                impar.empilha(num);
            }
        }

        System.out.println("Desempilhando todos os numeros da pilhar par");

        while (!par.estaVazia()) {
            System.out.println("Desempilhando da pilha par: " + par.desempilha());
        }

        System.out.println("Desempilhando todos os numeros da pilhar impar");

        while (!impar.estaVazia()) {
            System.out.println("Desempilhando da pilha impar: " + impar.desempilha());
        }
    }
}
