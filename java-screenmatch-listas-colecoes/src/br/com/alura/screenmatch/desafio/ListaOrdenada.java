package br.com.alura.screenmatch.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada {
    static void main() {

        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(0);
        listaDeNumeros.add(5);
        listaDeNumeros.add(4);
        listaDeNumeros.add(6);
        listaDeNumeros.add(3);
        listaDeNumeros.add(8);
        listaDeNumeros.add(2);
        listaDeNumeros.add(10);

        System.out.println("LISTA DE NÚMEROS PADRAO: \n" +  listaDeNumeros);

        Collections.sort(listaDeNumeros);
        System.out.println("LISTA ORDENADA COM O COLLECTIONS SORT : \n" + listaDeNumeros);
    }
}
