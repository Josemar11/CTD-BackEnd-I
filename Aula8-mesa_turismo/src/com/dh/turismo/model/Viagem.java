package com.dh.turismo.model;

public class Viagem {
    String dataPartida;
    String dataRetorno;
    String origem;
    String destino;
    String linhaAerea;
    String hotel;

    public Viagem(String dataPartida, String dataRetorno, String origem, String destino) {
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
        this.origem = origem;
        this.destino = destino;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getLinhaAerea() {
        return linhaAerea;
    }

    public void setLinhaAerea(String linhaAerea) {
        this.linhaAerea = linhaAerea;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}