package org.example.pessoa;

import org.example.exceptions.CpfException;

import java.time.LocalDate;

public class Medico extends Pessoa {

    private String crm;
    private Especializacao especializacao;


    public Medico(Integer id, String crm, Especializacao especializacao, String cpf, String nome, LocalDate nascimento, String sexo, String tipo_sanguineo) throws CpfException {
        super(id, cpf, nome, nascimento, sexo, tipo_sanguineo);
        this.crm = crm;
        this.especializacao = especializacao;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecializacao() {
        return especializacao.getNome_especializacao();
    }

}
