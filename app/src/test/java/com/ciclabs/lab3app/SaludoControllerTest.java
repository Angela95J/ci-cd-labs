package com.ciclabs.lab3app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SaludoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void devuelveSaludoPorDefecto() throws Exception {
        mockMvc.perform(get("/api/saludo"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hola, Mundo!"));
    }

    @Test
    void devuelveSaludoConNombreParametrizado() throws Exception {
        mockMvc.perform(get("/api/saludo").param("nombre", "CI-CD"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hola, CI-CD!"));
    }
}
