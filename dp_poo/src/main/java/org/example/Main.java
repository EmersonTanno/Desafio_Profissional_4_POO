package org.example;

import org.example.consulta.Consulta;
import org.example.consulta.ModalidadeConsulta;
import org.example.pessoa.Especializacao;
import org.example.pessoa.Medico;
import org.example.pessoa.Paciente;
import org.example.ubs.Ubs;


import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Consulta consulta = new Consulta();

        Medico matheus = new Medico(0, "123123", Especializacao.GINECOLOGIA, "123123214141143", "Matheus Dedo-Duro",
                new Date(2004, 8, 12), "Helicópitero", "O-");

        Paciente rubens = new Paciente(0, "123123414", "Rubens Pereira Junior",
                new Date(1999, 12, 6), "Indefinido", "A+", new Date(1999, 12, 7));

        Ubs ubs = new Ubs(0, "AAAA", "133412", 12, "Avenida do KRL", "2131432412");

        String retorno = consulta.agendar(1, matheus, rubens, ubs, ModalidadeConsulta.ONLINE, new Date(2023, 9, 6),
                new Date(2023, 9, 6, 12, 45), new Date(2023, 9, 6, 12, 50),
                "");

        System.out.println(retorno);

    }
}