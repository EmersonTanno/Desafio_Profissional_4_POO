package org.example.pessoa;

import java.util.Date;


public abstract class Pessoa {

    private Integer id;
    private String cpf;
    private String nome;
    private Date nascimento;
    private String sexo;
    private String tipo_sanguineo;

    public Pessoa(Integer id, String cpf, String nome, Date nascimento, String sexo, String tipo_sanguineo){
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public Integer getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

}
