package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    static void main() {

        // FILMES
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(5);

        var filmeDoPaulo = new Filme("Dogville", 2004);
        outroFilme.avalia(10);

        // SERIE
        Serie lost = new Serie("Lost",2000);
        lost.avalia(9);

        // ARRAY LIST
        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(lost);
        for(Titulo titulo : listaDeFilmes){
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getClassificacao() >2 ) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }


        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo Souza");
        buscaPorArtista.add("Jodrigo Turini");

        System.out.println("[SEM ORDENAÇÃO]: " + buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("[ORDENAÇÃO]: " + buscaPorArtista);

        System.out.println("LISTA DE TITULOS ORDENADOS");
        Collections.sort(listaDeFilmes);
        System.out.println(listaDeFilmes);

        listaDeFilmes.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenação por ano :" + listaDeFilmes);
    }
}
