package org.example.consulta;

public enum ModalidadeConsulta {

    PRESENCIAL(0, "Presencial"),
    ONLINE(1, "Online");

    private int id;
    private String tipo;

    ModalidadeConsulta(int id, String tipo){
        this.id = id;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }
}
