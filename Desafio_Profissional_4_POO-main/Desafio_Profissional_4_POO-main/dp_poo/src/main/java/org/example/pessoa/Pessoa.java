package org.example.pessoa;

import org.example.exceptions.CpfException;
import org.example.sistema.ValidadorCpf;

import java.time.LocalDate;


public abstract class Pessoa implements ValidadorCpf {

    private Integer id;
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String sexo;
    private TipoSanguineo tipo_sanguineo;

    public Pessoa(Integer id, String cpf, String nome, LocalDate nascimento, String sexo, TipoSanguineo tipo_sanguineo) throws CpfException {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.tipo_sanguineo = tipo_sanguineo;

        if(!validaCpf()){
            throw new CpfException();
        }
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

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public TipoSanguineo getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    @Override
    public boolean validaCpf(){

        String cpfFormatado = this.cpf.replaceAll("\\D", "");
        if(cpfFormatado.length() != 11){
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cpfFormatado.charAt(i));
            soma += digito * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);

        if (primeiroDigito == 10 || primeiroDigito == 11) {
            primeiroDigito = 0;
        }
        if (primeiroDigito != Character.getNumericValue(cpfFormatado.charAt(9))) {
            return false;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            int digito = Character.getNumericValue(cpfFormatado.charAt(i));
            soma += digito * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);

        if (segundoDigito == 10 || segundoDigito == 11) {
            segundoDigito = 0;
        }
        if (segundoDigito != Character.getNumericValue(cpfFormatado.charAt(10))) {
            return false;
        }

        return true;
    }
}
