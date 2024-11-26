package com.lucca.datastructure.pilha.labs;

import com.lucca.datastructure.pilha.Pilha;

import java.util.Scanner;

public class SimbolosBalanceados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua expressão:");
        String expressao = sc.nextLine();

        imprimeResultado(expressao);

        sc.close();
    }

    public static void imprimeResultado(String expressao) {
        System.out.println(expressao + " está balanceado? " +
                verificaSimbolosBalanceados(expressao));
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verificaSimbolosBalanceados(String expressao) {
        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.empilha(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1){
                if (pilha.estaVazia()) {
                    return false;
                } else {
                    topo = pilha.desempilha();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }

            index++;
        }

        return pilha.estaVazia();
    }
}
