package org.example.pessoa;

public enum TipoSanguineo {
    A_POSITIVO(0, "A+"),
    A_NEGATIVO(1, "A-"),
    B_POSITIVO(2, "B+"),
    B_NEGATIVO(3, "B-"),
    AB_POSITIVO(4, "AB+"),
    AB_NEGATIVO(5, "AB-"),
    O_POSITIVO(6, "O+"),
    O_NEGATIVO(7, "O-");

    private Integer idSangue;
    private String tipoSangue;

    TipoSanguineo(Integer idSangue, String tipoSangue) {
        this.idSangue = idSangue;
        this.tipoSangue = tipoSangue;
    }

    public Integer getIdSangue() {
        return idSangue;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

}
