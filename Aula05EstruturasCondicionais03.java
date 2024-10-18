package academy.devdojo.maratonajava.introducao;
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
         double salario = 3000;
         String mensagemDoar = "Eu vou doar  500 pro DevDojo";
         String mensagemNaoDoar = "Ainda nao tenho condiçoes, mas vou ter!";
         String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        // operador Ternario
        System.out.println(resultado);
    }
}
