package org.example;

public abstract class SemaforoEstado {

    public abstract String getEstado();

    public boolean acenderVerde(Semaforo semaforo) {
        return false;
    }

    public boolean acenderAmarelo(Semaforo semaforo) {
        return false;
    }

    public boolean acenderVermelho(Semaforo semaforo) {
        return false;
    }
}
