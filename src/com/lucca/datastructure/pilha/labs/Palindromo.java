package com.lucca.datastructure.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

// desafio do palímdromo utilizando pilhas da estrutura de dados
public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma palavra:");
        String palavra = sc.nextLine();

        imprimeResultado(palavra);

        sc.close();
    }

    public static void imprimeResultado(String palavra) {
        System.out.println("'" + palavra + "' é palíndromo? ");
        System.out.println(". . .");
        System.out.println(testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();

        for (int i =0; i < palavra.length(); i++) {
            pilha.add(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.isEmpty()) {
            palavraInversa += pilha.pop();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }
        return false;
    }
}
