package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** Calcule a média de NP1 e NP2 em um número inteiro");
        System.out.println("NP1: ");
        float NP1 = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("NP2: ");
        float NP2 = teclado.nextFloat();
        teclado.nextLine();
        float media = (NP1 + NP2) / 2;

        // conversão da média para inteiro
        int resultado = 0;
        resultado = (int) media;

        // Mostrando resultado
        System.out.println("Média final: "+resultado);
        }
    }
