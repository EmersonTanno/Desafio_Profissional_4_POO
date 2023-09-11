package org.example.pessoa;

import org.example.exceptions.CpfException;

import java.time.LocalDate;


public class Paciente extends Pessoa {

    private LocalDate ultima_consulta;

    public Paciente(Integer id, String cpf, String nome, LocalDate nascimento, String sexo, String tipo_sanguineo) throws CpfException {
        super(id, cpf, nome, nascimento, sexo, tipo_sanguineo);
    }

    public LocalDate getUltima_consulta() {
        return ultima_consulta;
    }
}
