package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** Preço do combustível ***");
        System.out.println("Quantidade de combustivel em litros: ");
        double combustivel = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Tipo: G - Gasolina, A - Álcool");
        String tipo = teclado.nextLine();
        char opcao = tipo.charAt(0);
        double precoLitro = 0;

        switch (opcao){
            case 'G':
                precoLitro = 4.90;
                if(combustivel <= 20) {
                    precoLitro *= (1 - 0.04);
                }
                else {
                    precoLitro *= (1 - 0.06);
                }
                break;
            case 'A':
                precoLitro = 6.00;
                if(combustivel <=20) {
                    precoLitro *= (1 - 0.03);
                }
                else {
                    precoLitro *= (1 - 0.05);
                }
                break;
            default:
                System.out.println("Não entendi a sua entrada");
                break;
        }
        double precoFinal = precoLitro * combustivel;

        // Imprimindo dados
        System.out.println("Preço a ser pago: R$"+precoFinal);

    }
}