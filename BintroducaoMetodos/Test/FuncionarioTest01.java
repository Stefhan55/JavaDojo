package javacore.BintroducaoMetodos.Test;

import javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Senku";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{1200,987.32,2000};


        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
