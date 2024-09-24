package com.lucca.datastructure.vetor.labs;

import com.lucca.datastructure.vetor.tests.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 extends Ex06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<Contato>(20);
        int opcao = 1;

        criarContatosDinamicamente(5, lista);

        while(opcao != 0) {
            opcao = obterOpcaoMenu(sc);

            switch (opcao) {
                case 1:
                    adicionarContatoFinal(sc, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(sc, lista);
                    break;
                case 3:
                    obtemContatoPosicao(sc, lista);
                    break;
                case 4:
                    obtemContato(sc, lista);
                case 5:
                    pesquisarUltimoIndice(sc, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(sc, lista);
                    break;
                case 7:
                    excluirPorPosicao(sc, lista);
                    break;
                case 8:
                    excluirPorContato(sc, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;

                default:
                    break;
            }
        }

        System.out.println("Saindo. . .");

        sc.close();
    }

    private static void adicionarContatoFinal(Scanner sc, ArrayList<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações");
        String nome = lerInformacao("Entre com o nome: ", sc);
        String telefone = lerInformacao("Entre com o telefone: ", sc);
        String email = lerInformacao("Entre com o email: ", sc);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner sc, ArrayList<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações");
        String nome = lerInformacao("Entre com o nome: ", sc);
        String telefone = lerInformacao("Entre com o telefone: ", sc);
        String email = lerInformacao("Entre com o email: ", sc);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posição a adicinar", sc);

        try {
            lista.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private static void obtemContatoPosicao(Scanner sc, ArrayList<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe! Seguem dados:");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner sc, ArrayList<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe! Seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado...");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner sc, ArrayList<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe! Seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado...");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na índice: " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner sc, ArrayList<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado...");
            boolean existe = lista.contains(contato);

            if(existe) {
                System.out.println("Contato existe! Seguem dados:");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }

            System.out.println("Contato encontrado na índice: " + existe);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner sc, ArrayList<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser removida: ", sc);

        try {
            lista.remove(pos);

            System.out.println("Contato excluído.");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorContato(Scanner sc, ArrayList<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser removida: ", sc);

        try {
            Contato contato = lista.get(pos);

            lista.remove(contato);

            System.out.println("Contato excluído.");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("Tamanho do vetor é: " + lista.size());
    }

    private static void limparVetor(ArrayList<Contato> lista) {

        lista.clear();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimirVetor(ArrayList<Contato> lista) {
        System.out.println(lista);
    }

    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

        Contato contato;

        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();

            contato.setNome("Contato " + i);
            contato.setTelefone("11111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.add(contato);
        }
    }
}
