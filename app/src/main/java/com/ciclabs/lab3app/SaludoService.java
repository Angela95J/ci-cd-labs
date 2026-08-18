package com.ciclabs.lab3app;

public final class SaludoService {

    private SaludoService() {
    }

    public static String construirSaludo(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        return "Hola, " + nombre + "!";
    }
}
