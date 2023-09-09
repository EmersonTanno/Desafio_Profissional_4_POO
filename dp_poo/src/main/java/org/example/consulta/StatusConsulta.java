package org.example.consulta;

public enum StatusConsulta {

    PENDENTE(0, "Pendente"),
    CONCLUIDA(1, "Concluída"),
    CANCELADA(2, "Cancelada");

    private Integer id;
    private String status;

    StatusConsulta(Integer id, String status){
        this.id = id;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public Integer getId() {
        return id;
    }
}
