package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Estudante;

import java.sql.SQLOutput;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = " Diuliano ";
        estudante.idade = 24;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
