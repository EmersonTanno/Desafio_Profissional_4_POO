package org.example.sistema;

import org.example.consulta.ModalidadeConsulta;
import org.example.consulta.StatusConsulta;
import org.example.pessoa.Especializacao;
import org.example.pessoa.Medico;
import org.example.pessoa.Paciente;
import org.example.ubs.Ubs;

import java.time.LocalDateTime;

public interface GerenciadorConsulta {


    String agendar(Integer id, Medico medico, Paciente paciente, Ubs ubs, ModalidadeConsulta modalidade, LocalDateTime horaInicio);

    String cancelar(Integer idConsulta);

    String alterarStatus(Integer idConsulta);

}
