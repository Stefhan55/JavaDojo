package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +- / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);
        // % verifirar o resultado da divisao
        int resto = 28 % 2;
        System.out.println(resto);

        // operadores logicos sempre retornam true ou false < > ,= => == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10< 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteQueDez = 10 != 10;

        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteQueDez);

    }
}
