package org.example;

public class SemaforoEstadoVermelho extends SemaforoEstado{

    private SemaforoEstadoVermelho() {};
    private static SemaforoEstadoVermelho instance = new SemaforoEstadoVermelho();
    public static SemaforoEstadoVermelho getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Luz Vermelha Acesa";
    }

    public boolean acenderVerde(Semaforo semaforo) {
        semaforo.setEstado(SemaforoEstadoVerde.getInstance());
        return true;
    }
}
