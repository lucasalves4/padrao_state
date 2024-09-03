package org.example;

public class SemaforoEstadoAmarelo extends SemaforoEstado{

    private SemaforoEstadoAmarelo() {};
    private static SemaforoEstadoAmarelo instance = new SemaforoEstadoAmarelo();
    public static SemaforoEstadoAmarelo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Luz Amarela Acesa";
    }

    public boolean acenderVermelho(Semaforo semaforo) {
        semaforo.setEstado(SemaforoEstadoVermelho.getInstance());
        return true;
    }
}
