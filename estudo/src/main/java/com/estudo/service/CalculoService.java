package com.estudo.service;

public class CalculoService {

    public Float calcularGastoDisponivel(Float quantidadeSaldo, Integer quantidadeDias){
        if (quantidadeDias == null || quantidadeDias == 0){
            return 0F;
        }
        return quantidadeSaldo/quantidadeDias;
    }
}
