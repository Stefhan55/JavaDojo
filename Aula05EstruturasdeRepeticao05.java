package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasdeRepeticao05 {
    public static void main(String[] args) {
        // dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
        // condiao valorParcela >= 1000
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal ; parcela >= 1 ; parcela --) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println(" parcela" + parcela+ " R$ "+ valorParcela);
        }
    }
}
