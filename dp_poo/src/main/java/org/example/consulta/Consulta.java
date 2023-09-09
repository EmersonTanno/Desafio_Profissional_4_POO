package org.example.consulta;

import org.example.pessoa.Especializacao;
import org.example.pessoa.Medico;
import org.example.pessoa.Paciente;
import org.example.sistema.GerenciadorConsulta;
import org.example.ubs.Ubs;

import java.util.Date;

public class Consulta implements GerenciadorConsulta {

    private Integer id;
    private Medico medico;
    private Paciente paciente;
    private Ubs ubs;
    private ModalidadeConsulta modalidade;
    private Date dataConsulta;
    private Date horaInicio; //conferir depois
    private Date horaFinal; //conferir depois
    private String anotacoes;
    private StatusConsulta statusConsulta;

    public Consulta() {

    }

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

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public Date getHoraFinal() {
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
    public String agendar(Integer id, Medico medico, Paciente paciente, Ubs ubs, ModalidadeConsulta modalidade, Date dataConsulta, Date horaInicio, Date horaFinal, String anotacoes) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.ubs = ubs;
        this.modalidade = modalidade;
        this.dataConsulta = dataConsulta;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.anotacoes = anotacoes;
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
