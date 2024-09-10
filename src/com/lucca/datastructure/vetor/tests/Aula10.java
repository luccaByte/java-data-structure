package com.lucca.datastructure.vetor.tests;

import com.lucca.datastructure.vetor.VetorObjeto;

public class Aula10 {

    public static void main(String[] args) {
        
        VetorObjeto vetor = new VetorObjeto(3);

        Contato c1 = new Contato("Contato 1", "1234-5678", "contatoum@email.com");
        Contato c2 = new Contato("Contato 2", "5324-6789", "contatodois@email.com");
        Contato c3 = new Contato("Contato 3", "9679-7654", "contatotres@email.com");
        Contato c4 = new Contato("Contato 1", "1234-5678", "contatoum@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho: " + vetor.tamanho());

        int pos = vetor.busca(c4); // existe no vetor mesmo que c4 e c1 estejam em posiçoes diferentes na memoria
        if (pos > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("O elemento nao existe no vetor");
        }

        System.out.println(vetor);
    }
}
