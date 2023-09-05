package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** Calculadora ***");
        System.out.println("Primeiro numero: ");
        double numero1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Segundo numero: ");
        double numero2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Escolha: soma, subtração, multiplicação, divisão, exponencial");
        String escolha = teclado.nextLine();
        double resultado = 0;
        switch (escolha) {
            case "soma":
                resultado = numero1 + numero2;
                break;
            case "subtração":
                resultado = numero1 - numero2;
                break;
            case "multiplicação":
                resultado = numero1 * numero2;
                break;
            case "divisão":
                resultado = numero1 / numero2;
                break;
            case "exponencial":
                resultado = Math.pow(numero1, numero2);
                break;
            default:
                System.out.println("Não entendi a sua entrada");
                break;
        }
        // Imprimindo resultado
        System.out.println("Resultado: "+resultado);
    }
}