package academy.devdojo.maratonajava.introducao;



public class Aula07Arrays02 {
    // byte, short , int , double 0
    //char '/u0000'''
    //boolean false
    //String null

    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = " GOKU ";
        nomes[1] = " VEGETA ";
        nomes[2] = " MAJIN BOO ";
        nomes[3] = " Gotenks";
        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i]);
        }
    }
}
