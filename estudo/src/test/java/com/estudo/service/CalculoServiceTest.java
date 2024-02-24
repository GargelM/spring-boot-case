package com.estudo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoServiceTest {

    @Test
    void dadoUmSaldoValidoEUmaQuantidadeDiasValida_QuandoOMetodoCalcularGastoDisponivelEChamado_EntaoUmValorEspecificoDeveSerRetornado(){
        CalculoService calculoService = new CalculoService();
        Float resultado = calculoService.calcularGastoDisponivel(10F,2);
        assertEquals(5F,resultado);
    }
    @Test
    void deveEntenderNullComoZero(){
        CalculoService calculoService = new CalculoService();
        Float resultado = calculoService.calcularGastoDisponivel(10F,null);
        assertEquals(0F,resultado);
    }

    @Test
    void deveRetornarZeroCasoQuantidadeDeDiasForZero(){
        CalculoService calculoService = new CalculoService();
        Float resultado = calculoService.calcularGastoDisponivel(10F,0);
        assertEquals(0F,resultado);

    }


}
