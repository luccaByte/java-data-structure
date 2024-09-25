package com.lucca.datastructure.base;

public class EstruturaEstatica<T> {
    private T[] elementos;
    private int tamanho;

    // melhor opçao
    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade]; //solução do livro effective Java
        this.tamanho = 0;
    }

    // 2 opçao
    public EstruturaEstatica() {
        this(10);
    }

    protected boolean adiciona(T elemento) {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {

            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    protected boolean adiciona(int posicao, T elemento) {

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
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2]; // a melhor forma de aumentar a capacidade é dobrando o vetor

            for (int i=0; i<this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
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
