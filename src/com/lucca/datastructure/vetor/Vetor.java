package com.lucca.datastructure.vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // opçao 1
    // public void adiciona(String elemento) {
    //     for(int i = 0; i < this.elementos.length; i++){
    //         if (this.elementos[i] == null) {
    //             this.elementos[i] = elemento;
    //             break;
    //         }
    //     }
    // }

    // opção 2 - melhorando o método adiciona
    // public void adiciona(String elemento) throws Exception {

    //     if (this.tamanho < this.elementos.length) {
            
    //         this.elementos[this.tamanho] = elemento;
    //         this.tamanho++;
    //     } else {
    //         throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
    //     }
    // }

    //opçao 3
    public boolean adiciona(String elemento) {

        if (this.tamanho < this.elementos.length) {
            
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }
}
