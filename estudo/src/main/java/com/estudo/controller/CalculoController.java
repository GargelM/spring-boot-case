package com.estudo.controller;


import com.estudo.service.CalculoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gargeis")
public class CalculoController {

    @GetMapping
    public Float calcular(@RequestParam(defaultValue = "0") Float saldo,@RequestParam(defaultValue = "0")  Integer quantidadeDias){
        return new CalculoService().calcularGastoDisponivel(saldo,quantidadeDias) ;
    }

    @GetMapping("/Bolsonaro")
    public String oqueEuQuizer2(){
        return "Qualquer String Hi Bolsonaro";
    }



}
