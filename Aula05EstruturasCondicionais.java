package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        //if se else senão
        int age = 15;
        boolean isAutorizadoComprarBebida = age >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        if (!isAutorizadoComprarBebida){
            System.out.println("Nao Autorizado a Comprar Bebida alcolica");
        }
         boolean c = true;
         if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do IF");
    }
}
