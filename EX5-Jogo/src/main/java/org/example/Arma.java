package org.example;

public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostrarInfo() {
        System.out.println("Descricao: " + descricao);
        System.out.println("Resistencia: " + resistencia);
    }

}
