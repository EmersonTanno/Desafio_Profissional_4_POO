package org.example.pessoa;

public enum Especializacao {

    CARDIOLOGIA(0, "Cardiologista"),
    DERMATOLOGIA(1, "Dermatologista"),
    ENDOCRINOLOGIA(2, "Endocrinologista"),
    GINECOLOGIA(3, "Ginecologista"),
    NEUROLOGIA(4, "Neurologista"),
    ORTOPEDIA(5, "Ortopedista"),
    PEDIATRIA(6, "Pediatra"),
    PSIQUIATRIA(7, "Psiquiatra"),
    UROLOGIA(8, "Urologista"),
    OFTALMOLOGIA(9, "Oftalmologista"),
    OTORRINOLARINGOLOGIA(10, "Otorrinolaringologista"),
    CIRURGIA_GERAL(11, "Cirurgião-Geral"),
    RADIOLOGIA(12, "Radiologista"),
    ONCOLOGIA(13, "Oncologista"),
    GASTROENTEROLOGIA(14, "Gastroenterologista"),
    NEFROLOGIA(15, "Nefrologista"),
    PNEUMOLOGIA(16, "Pneumologista"),
    REUMATOLOGIA(17, "Reumatologista"),
    HEMATOLOGIA(18, "Hematologistas"),
    INFECTOLOGIA(19, "Infectologista"),
    ANESTESIOLOGIA(20, "Anestesiologista"),
    MEDICINA_INTENSIVA(21, "Médicos intensivista");

    private int id_especializacao;
    private String nome_especializacao;

    Especializacao(int id_especializacao, String nome_especializacao){
        this.id_especializacao = id_especializacao;
        this.nome_especializacao = nome_especializacao;
    }

    public int getId_especializacao() {
        return id_especializacao;
    }

    public String getNome_especializacao() {
        return nome_especializacao;
    }
}
