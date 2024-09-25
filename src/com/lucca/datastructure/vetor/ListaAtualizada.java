package com.lucca.datastructure.vetor;

import com.lucca.datastructure.base.EstruturaEstatica;

public class ListaAtualizada<T> extends EstruturaEstatica<T> {
    public ListaAtualizada() {
        super();
    }

    public ListaAtualizada(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }
}
