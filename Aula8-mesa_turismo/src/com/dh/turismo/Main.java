package com.dh.turismo;

import com.dh.turismo.model.Viagem;
import com.dh.turismo.service.impl.FacadeTurismoImpl;

public class Main {
    public static void main(String[] args) {
        //criar o cliente da facade
        FacadeTurismoImpl cliente = new FacadeTurismoImpl();

        //criar viagens
        Viagem viagem1 = new Viagem("02/07/2018", "08/07/2018", "São Paulo", "Cancún");
        Viagem viagem2 = new Viagem("02/07/2018", "08/07/2018", "Belo Horizonte", "Quito");

        //solicitar uma pesquisa
        viagem1 = cliente.buscar(viagem1);

        System.out.println("==============================");
        System.out.println("Voos encontrados para " + viagem1.getDestino() + " desde " + viagem1.getOrigem());
        System.out.println("Data Ida: " + viagem1.getDataPartida() + " Data Volta " + viagem1.getDataRetorno());
        System.out.println("Linha aérea disponível: " + viagem1.getLinhaAerea());
        System.out.println("......");
        System.out.println("Hotéis encontrados para: "+ viagem1.getDestino());
        System.out.println("Entrada: " + viagem1.getDataPartida() + " Saída: " + viagem1.getDataRetorno());
        System.out.println("Hotel disponível: " + viagem1.getHotel());
        System.out.println("==============================");


        //solicitar uma pesquisa
        cliente.buscar(viagem2);

        System.out.println("==============================");
        System.out.println("Voos encontrados para " + viagem2.getDestino() + " desde " + viagem2.getOrigem());
        System.out.println("Data Ida: " + viagem2.getDataPartida() + " Data Volta " + viagem2.getDataRetorno());
        System.out.println("Linha aérea disponível: " + viagem2.getLinhaAerea());
        System.out.println("......");
        System.out.println("Hotéis encontrados para: "+ viagem2.getDestino());
        System.out.println("Entrada: " + viagem2.getDataPartida() + " Saída: " + viagem2.getDataRetorno());
        System.out.println("Hotel disponível: " + viagem2.getHotel());
        System.out.println("==============================");
    }
}
