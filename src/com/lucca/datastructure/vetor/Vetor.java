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

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +
    public boolean adiciona(int posicao, String elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        this.aumentaCapacidade();

        // mover todos os elementos
        for (int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    // aumentar capacidade do vetor
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2]; // a melhor forma de aumentar a capacidade é dobrando o vetor

            for (int i=0; i<this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
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
