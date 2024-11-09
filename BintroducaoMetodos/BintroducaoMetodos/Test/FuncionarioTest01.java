package javacore.BintroducaoMetodos.Test;

import javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Senku");
        funcionario.setIdade(3600);
        funcionario.setSalarios(new double[]{1200,987.32,2000});


        funcionario.imprime();
        System.out.println("\nMedia" + funcionario.getMedia());
    }
}
