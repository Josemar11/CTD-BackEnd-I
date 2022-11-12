package com.dh.arvore.factory;

import com.dh.arvore.model.Arvore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ArvoreFactory {
    static Map<String, Arvore> TIPO_ARVORES = new HashMap<>();

    public static Arvore getTreeType(final String tipoArvore, final int altura, final int largura, final String cor) {
        Arvore arvore = TIPO_ARVORES.get(tipoArvore);

        if (Objects.isNull(arvore)) {
            arvore = new Arvore(altura, largura, cor, tipoArvore);
            TIPO_ARVORES.put(tipoArvore, arvore);
            return arvore;
        }

        return arvore;
    }
}
