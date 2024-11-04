package javacore.BintroducaoMetodos.Test;

import javacore.BintroducaoMetodos.dominio.Estudante2;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante2 estudante01 = new Estudante2();
        Estudante2 estudante02 = new Estudante2();
        estudante01.nome = "Midorya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
