package org.example.ubs;

public class Ubs {

    private Integer id;
    private String nome;
    private String cep;
    private Integer numero;
    private String logradouro;
    private String telefone;

    public Ubs(Integer id, String nome, String cep, Integer numero, String logradouro, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCep() {
        return cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getTelefone() {
        return telefone;
    }



}
