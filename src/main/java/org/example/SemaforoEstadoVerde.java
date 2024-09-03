package org.example;

public class SemaforoEstadoVerde extends SemaforoEstado{

    private SemaforoEstadoVerde() {};
    private static SemaforoEstadoVerde instance = new SemaforoEstadoVerde();
    public static SemaforoEstadoVerde getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Luz Verde Acesa";
    }

    public boolean acenderAmarelo(Semaforo semaforo) {
        semaforo.setEstado(SemaforoEstadoAmarelo.getInstance());
        return true;
    }
}
