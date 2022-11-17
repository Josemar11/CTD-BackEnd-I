package com.dh.inteiros;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ListaMedia {
    private static final Logger logger = Logger.getLogger(ListaMedia.class);
    private List<Integer> inteiros = new ArrayList<>();

    public ListaMedia(List<Integer> inteiros) throws Exception {
        this.inteiros = inteiros;
        comparaLista(inteiros);
    }

    private void comparaLista(List<Integer> inteiros) throws Exception {
        if(inteiros.size() > 5 && inteiros.size() < 10) {
            logger.info("O comprimento da lista é maior que 5");
        }
        if(inteiros.size() > 10) {
            logger.info("O comprimento da lista é maior que 10");
        }
        if(inteiros.size() == 0) {
            throw new Exception();
        }
    }

    public int media() {
        int soma = 0;
        for (Integer inteiro: inteiros) {
            soma = soma + inteiro;
        }
        int media = soma / inteiros.size();
        logger.info("A media da lista é: " + media);
        return media;
    }
}
