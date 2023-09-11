package org.example.exceptions;

public class CpfException extends Exception {

    public CpfException() {
        super("O CPF informado não não é válido");
    }

}