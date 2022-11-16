package com.dh.turismo.test;

import com.dh.turismo.model.Viagem;
import com.dh.turismo.service.impl.FacadeTurismoImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FacadeTurismoImplTest {
    private FacadeTurismoImpl facadeTurismo = new FacadeTurismoImpl();

    @Test
    void validarBuscaTest() {
        Viagem viagem = new Viagem("21/02/2022", "21/03/2022", "Belo Horizonte", "Canadá");
        viagem = facadeTurismo.buscar(viagem);

        assertNotNull(viagem.getLinhaAerea());
        assertNotNull(viagem.getHotel());
    }
}
