package com.dh.inteiros;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            ListaMedia listaMediaMaior5 = new ListaMedia(Arrays.asList(1, 2, 3, 4, 5, 6));
            ListaMedia listaMediaMaior10 = new ListaMedia(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
            int listaMedia = new ListaMedia(Arrays.asList(1,2,3,4,5)).media();
            ListaMedia listaMediaVazia = new ListaMedia(Arrays.asList());
        } catch (Exception e) {
            logger.error("A lista é igual a zero ", e);
        }
    }
}
