package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SemaforoTest {

    Semaforo semaforo;

    @BeforeEach
    public void setUp() {
        semaforo = new Semaforo();
    }

    // Luz Verde Acesa

    @Test
    public void deveAcenderLuzAmarela() {
        semaforo.setEstado(SemaforoEstadoVerde.getInstance());
        assertTrue(semaforo.acenderAmarelo());
        assertEquals(SemaforoEstadoAmarelo.getInstance(), semaforo.getEstado());
    }

    @Test
    public void naoDeveAcenderLuzVerde() {
        semaforo.setEstado(SemaforoEstadoVerde.getInstance());
        assertFalse(semaforo.acenderVerde());
    }

    @Test
    public void naoDeveAcenderLuzVermelha() {
        semaforo.setEstado(SemaforoEstadoVerde.getInstance());
        assertFalse(semaforo.acenderVermelho());
    }

    // Luz Amarela Acesa

    @Test
    public void deveAcenderLuzVermelha() {
        semaforo.setEstado(SemaforoEstadoAmarelo.getInstance());
        assertTrue(semaforo.acenderVermelho());
        assertEquals(SemaforoEstadoVermelho.getInstance(), semaforo.getEstado());
    }

    @Test
    public void naoDeveAcenderLuzAmarela() {
        semaforo.setEstado(SemaforoEstadoAmarelo.getInstance());
        assertFalse(semaforo.acenderAmarelo());
    }

    @Test
    public void naoDeveAcenderLuzVerde2() {
        semaforo.setEstado(SemaforoEstadoAmarelo.getInstance());
        assertFalse(semaforo.acenderVerde());
    }

    // Luz Vermelha Acesa

    @Test
    public void deveAcenderLuzVerde() {
        semaforo.setEstado(SemaforoEstadoVermelho.getInstance());
        assertTrue(semaforo.acenderVerde());
        assertEquals(SemaforoEstadoVerde.getInstance(), semaforo.getEstado());
    }

    @Test
    public void naoDeveAcenderLuzVermelha2() {
        semaforo.setEstado(SemaforoEstadoVermelho.getInstance());
        assertFalse(semaforo.acenderVermelho());
    }

    @Test
    public void naoDeveAcenderLuzAmarela2() {
        semaforo.setEstado(SemaforoEstadoVermelho.getInstance());
        assertFalse(semaforo.acenderAmarelo());
    }

}