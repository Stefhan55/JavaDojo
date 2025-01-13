package javacore.Dconstrutores.dominio.test;

import javacore.Dconstrutores.dominio.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece","acao",12, "shounen");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}
