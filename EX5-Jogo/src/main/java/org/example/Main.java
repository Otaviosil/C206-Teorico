package org.example;

public class Main {
    public static void main(String[] args) {
        Personagem pers1 = new Personagem();
        Personagem pers2 = new Personagem();

        pers1.vida = 90;
        pers2.vida = 85;

        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        arma1.descricao = "Artorias Greatsword";
        arma2.descricao = "Twinblades";

        pers1.arma = arma1;
        pers2.arma = arma2;

        System.out.println("Vida do pers1: " + pers1.vida);

        pers1.tomarDano();

        System.out.println("Vida do pers1 apos tomar dano: " + pers1.vida);

        System.out.println("Info da arma de pers2");
        pers2.arma.mostrarInfo();
        pers2.usarArma();
        System.out.println("Usou a Arma");
        System.out.println("Nova Info");
        pers2.arma.mostrarInfo();

    }
}