package org.example.pessoa;

import org.example.pessoa.Pessoa;

import java.util.Date;

public class Paciente extends Pessoa {

    private Date ultima_consulta;

    public Paciente(Integer id, String cpf, String nome, Date nascimento, String sexo, String tipo_sanguineo, Date ultima_consulta) {
        super(id, cpf, nome, nascimento, sexo, tipo_sanguineo);
        this.ultima_consulta = ultima_consulta;
    }

    public Date getUltima_consulta() {
        return ultima_consulta;
    }
}
