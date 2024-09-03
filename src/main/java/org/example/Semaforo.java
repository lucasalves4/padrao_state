package org.example;

public class Semaforo {

    private String cor;
    private SemaforoEstado estado;

    public Semaforo() {
        this.estado = SemaforoEstadoVerde.getInstance();
    }
    public void setEstado(SemaforoEstado estado) {
        this.estado = estado;
    }

    public boolean acenderVerde() {
        return estado.acenderVerde(this);
    }

    public boolean acenderAmarelo() {
        return estado.acenderAmarelo(this);
    }

    public boolean acenderVermelho() {
        return estado.acenderVermelho(this);
    }

    public String getCor() {
        return cor;
    }

    public Semaforo setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public SemaforoEstado getEstado() {
        return estado;
    }

}
