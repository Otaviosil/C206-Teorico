package org.example;

public class Personagem {
    String nome;
    int vida;
    int pontos;
    Arma arma;

    void usarArma() {
        arma.resistencia -= 2;
    }

    void tomarDano() {
        vida -= 5;
    }

}
