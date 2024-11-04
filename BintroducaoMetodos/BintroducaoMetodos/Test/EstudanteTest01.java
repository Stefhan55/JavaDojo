package javacore.BintroducaoMetodos.Test;

import javacore.BintroducaoMetodos.dominio.Estudante2;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante2 estudante01 = new Estudante2();
        Estudante2 estudante02 = new Estudante2();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midorya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
         estudante01.nome = "Goham";

        System.out.println("quando atualiza a referencia do nome faz com que a variavel anterior morre e e substitui pela atual ");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
