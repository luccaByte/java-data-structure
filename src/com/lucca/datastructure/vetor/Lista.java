package com.lucca.datastructure.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    // melhor opçao
    public Lista(int capacidade){
		this.elementos = (T[]) new Object[capacidade]; //solução do livro effective Java
		this.tamanho = 0;
	}

    // 2 opçao
    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    public boolean adiciona(int posicao, T elemento) {

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

    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        return this.elementos[posicao];
    }

    // busca sequencial
    public int busca(T elemento) {
        for(int i=0; i < this.tamanho; i++){
            // Quando for string, comparar utilizando .equals e nao ==
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1; // posiçao que nao existe no vetor
    }

    public int ultimoIndice(T elemento) {
        for(int i=this.tamanho-1; i >= 0; i--){
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public boolean contem(T elemento) {
        // int pos = busca(elemento);
        // if (pos > 1) {
        //     return true;
        // }
        // return false;

        // opçao melhor
        return busca(elemento) > -1; // >= 0
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        for (int i=posicao;i<this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }

        this.tamanho--;
    }

    // método remove elemento
    public void remove(T elemento) {
        int pos = this.busca(elemento);
        if (pos > -1) {
            this.remove(pos);
        }
    }

    public void limpar() {

        // opçao 1
        // this.elementos = (T[])new Object[this.elementos.length];

        // opçao 2
        // this.tamanho = 0;

        // opçao 3: dependendo do tamanho do vetor, pode ser a melhor opçao
        for (int i=0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
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
