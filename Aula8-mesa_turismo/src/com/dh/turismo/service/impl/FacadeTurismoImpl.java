package com.dh.turismo.service.impl;

import com.dh.turismo.model.Viagem;
import com.dh.turismo.service.IFacadeTurimo;

public class FacadeTurismoImpl implements IFacadeTurimo {
    //armazenam nas variáveis uma instância de cada um
    private VooAPI vooAPI;
    private HotelAPI hotelAPI;

    //construtor que cria as instâncias
    public FacadeTurismoImpl() {
        vooAPI = new VooAPI();
        hotelAPI = new HotelAPI();
    }

    //simplifica as buscas de voos e hotéis
    public Viagem buscar(Viagem viagem) {
        viagem.setLinhaAerea(vooAPI.buscarVoos(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getOrigem(), viagem.getDestino()));
        viagem.setHotel(hotelAPI.buscarHoteis(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getDestino()));

        return viagem;
    }
}
