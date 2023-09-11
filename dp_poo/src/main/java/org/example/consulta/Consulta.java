package org.example.consulta;

import org.example.pessoa.Especializacao;
import org.example.pessoa.Medico;
import org.example.pessoa.Paciente;
import org.example.sistema.GerenciadorConsulta;
import org.example.ubs.Ubs;

import java.time.LocalDateTime;

public class Consulta implements GerenciadorConsulta {

    private Integer id;
    private Medico medico;
    private Paciente paciente;
    private Ubs ubs;
    private ModalidadeConsulta modalidade;
    private LocalDateTime horaInicio; //conferir depois
    private LocalDateTime horaFinal; //conferir depois
    private String anotacoes;
    private StatusConsulta statusConsulta;

    public Integer getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Ubs getUbs() {
        return ubs;
    }

    public ModalidadeConsulta getModalidade() {
        return modalidade;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public LocalDateTime getHoraFinal() {
        return horaFinal;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public StatusConsulta getStatusConsulta() {
        return statusConsulta;
    }

    //métodos do gerenciador
    @Override
    public String agendar(Integer id, Medico medico, Paciente paciente, Ubs ubs, ModalidadeConsulta modalidade, LocalDateTime horaInicio) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.ubs = ubs;
        this.modalidade = modalidade;
        this.horaInicio = horaInicio;
        this.horaFinal = horaInicio.plusMinutes(30);
        this.statusConsulta = StatusConsulta.PENDENTE;
        return "Consulta Marcada";
    }

    @Override
    public String cancelar(Integer idConsulta) {
        this.statusConsulta = StatusConsulta.CANCELADA;
        return "Consulta cancelada";
    }

    @Override
    public String alterarStatus(Integer idConsulta) {
        this.statusConsulta = StatusConsulta.CONCLUIDA;
        return "Consulta concluída";
    }

}
