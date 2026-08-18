package com.ciclabs.lab3app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SaludoServiceTest {

    @Test
    void construyeSaludoConNombreValido() {
        String resultado = SaludoService.construirSaludo("Angela");
        assertEquals("Hola, Angela!", resultado);
    }

    @Test
    void lanzaExcepcionCuandoNombreEsVacio() {
        assertThrows(IllegalArgumentException.class, () -> SaludoService.construirSaludo("  "));
    }

    @Test
    void lanzaExcepcionCuandoNombreEsNulo() {
        assertThrows(IllegalArgumentException.class, () -> SaludoService.construirSaludo(null));
    }
}
