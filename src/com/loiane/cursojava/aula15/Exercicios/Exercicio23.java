package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tipo;
        double qtd;
        System.out.println("Entre com o tipo da carne: ");
        System.out.println("1 - File duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        tipo = scan.nextInt();

        System.out.println("Informe a quantidade (KG)");
        qtd = scan.nextDouble();

        double precoKG = 0;
        if (tipo == 1) {
            System.out.println(qtd + "kg - File duplo ");
            if (qtd < 5) {
                precoKG = 4.90;
            } else {
                precoKG = 5.80;
            }
        } else if (tipo == 2) {
            System.out.println(qtd + "kg - Alcatra");
            if (qtd < 5) {
                precoKG = 5.90;
            } else {
                precoKG = 6.80;
            }
        } else if (tipo == 3) {
            System.out.println(qtd + "kg - Picanha ");
            if (qtd < 5) {
                precoKG = 6.90;
            } else {
                precoKG = 7.80;
            }
        }

        double total = qtd * precoKG;
        System.out.println(qtd + " KG * " + precoKG + " = " + total);

        System.out.println(" Compra no cartão ? Digite 1 para sim: ");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar de: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar de: " + (total));
        }
    }
}
