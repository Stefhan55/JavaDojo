package javacore.CsobrecargaMetodos.test;

import javacore.CsobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Classrom of the Elite","TV TOKIO",12,"Ação");
        anime.imprime();
    }
}
