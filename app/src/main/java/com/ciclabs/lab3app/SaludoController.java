package com.ciclabs.lab3app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/api/saludo")
    public String saludo(@RequestParam(name = "nombre", defaultValue = "Mundo") String nombre) {
        return SaludoService.construirSaludo(nombre);
    }
}
