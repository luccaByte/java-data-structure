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

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        return this.elementos[posicao];
    }

    // busca sequencial
    public int busca(String elemento) {
        for(int i=0; i < this.tamanho; i++){
            // Quando for string, comparar utilizando .equals e nao ==
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1; // posiçao que nao existe no vetor
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0) {
            s.append(this.elementos[this.tamanho-1]);
        }

       s.append("]");

        return s.toString();
    }
}
