package br.com.alura.screenmatch.desafio;

import java.util.ArrayList;

public class ArrayTreino {
    static void main() {
        ArrayList<String> linguagem = new ArrayList<>();
        linguagem.add("Java");
        linguagem.add("Python");
        linguagem.add("C");

        for (String l : linguagem) {
            System.out.println(l);
        }
    }
}
