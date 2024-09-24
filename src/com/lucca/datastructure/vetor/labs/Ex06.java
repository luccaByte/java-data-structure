package com.lucca.datastructure.vetor.labs;

import com.lucca.datastructure.vetor.Lista;
import com.lucca.datastructure.vetor.tests.Contato;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista<Contato> lista = new Lista<Contato>(20);
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

    private static void adicionarContatoFinal(Scanner sc, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações");
        String nome = lerInformacao("Entre com o nome: ", sc);
        String telefone = lerInformacao("Entre com o telefone: ", sc);
        String email = lerInformacao("Entre com o email: ", sc);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner sc, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações");
        String nome = lerInformacao("Entre com o nome: ", sc);
        String telefone = lerInformacao("Entre com o telefone: ", sc);
        String email = lerInformacao("Entre com o email: ", sc);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posição a adicinar", sc);

        try {
            lista.adiciona(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private static void obtemContatoPosicao(Scanner sc, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe! Seguem dados:");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner sc, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe! Seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado...");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner sc, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe! Seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado...");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na índice: " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner sc, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado...");
            boolean existe = lista.contem(contato);

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

    private static void excluirPorPosicao(Scanner sc, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser removida: ", sc);

        try {
            lista.remove(pos);

            System.out.println("Contato excluído.");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorContato(Scanner sc, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser removida: ", sc);

        try {
            Contato contato = lista.busca(pos);

            lista.remove(contato);

            System.out.println("Contato excluído.");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println("Tamanho do vetor é: " + lista.tamanho());
    }

    private static void limparVetor(Lista<Contato> lista) {

        lista.limpar();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimirVetor(Lista<Contato> lista) {
        System.out.println(lista);
    }

    protected static String lerInformacao(String msg, Scanner sc) {
        System.out.println(msg);
        String entrada = sc.nextLine();

        return entrada;
    }

    protected static int lerInformacaoInt(String msg, Scanner sc) {
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {

            try {
                System.out.println(msg);
                String entrada = sc.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente.");
            }

        }

        return num;
    }

    protected static int obterOpcaoMenu(Scanner sc) {
        boolean entradaValida = false;
        String entrada;
        int opcao  = 0;

        while (!entradaValida) {
            System.out.println("""
            ===============================================
            Digite a opção desejada:
            
            1: Adiciona contato no final do vetor
            2: Adiciona contato em uma posição específica
            3: Obtém contato de uma posição específica
            4: Consulta contato
            5: Consulta último índice do contato
            6: Verifica se o contato existe
            7: Excluir por posição
            8: Excluir contato
            9: Verifica o tamanho do vetor
            10: Excluir todos os contatos do vetor
            11: Imprime o vetor
            0: SAIR
            ===============================================
            """);

            try {
                entrada = sc.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n\n");
            }
        }

        return opcao;
    }

    protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

        Contato contato;

        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();

            contato.setNome("Contato " + i);
            contato.setTelefone("11111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);
        }
    }
}
