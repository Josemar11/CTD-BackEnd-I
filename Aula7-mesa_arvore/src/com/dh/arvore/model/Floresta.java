package com.dh.arvore.model;

import com.dh.arvore.factory.ArvoreFactory;

import java.util.ArrayList;
import java.util.List;

public class Floresta {
    private static final List<Arvore> ARVORE = new ArrayList<>();

    public void plantarArvore(final String tipoArvore, final int altura, final int largura, final String cor) {
        final Arvore arvore = ArvoreFactory.getTreeType(tipoArvore, altura, largura, cor);
        ARVORE.add(arvore);
    }

    public List<Arvore>  getArvores(){
        return ARVORE;
    }
}
