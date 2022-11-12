package com.dh.arvore;

import com.dh.arvore.model.Floresta;

public class Main {
    public static void main(String[] args) {
        final Floresta floresta = new Floresta();

        for (int i = 0; i < 1000000; i++) {
            floresta.plantarArvore("ORNAMENTAIS", 200, 400, "verde");
            floresta.plantarArvore("FRUTÍFERAS", 500, 300, "vermelho");
            floresta.plantarArvore("FRUTÍFERAS", 100, 200, "azul");
            floresta.plantarArvore("ORNAMENTAIS", 200, 400, "verde");
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}
