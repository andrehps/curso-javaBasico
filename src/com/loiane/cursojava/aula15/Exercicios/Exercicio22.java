package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double qtdMorango = 0,
                qtdMaca = 0,
                precoKGMorango = 0,
                precoKGMaca = 0,
                precoTotalMorango = 0;

        System.out.print("Quantidade de Morango que deseja comprar:");
        qtdMorango = scan.nextDouble();

        System.out.print("Quantidade de maça que deseja comprar:");
        qtdMaca = scan.nextDouble();

        if (precoKGMorango <= 5) {
            qtdMorango = 2.50;
            precoKGMorango = 2.50;
        } else {
            precoKGMorango = 2.20;
        }

        if (qtdMaca <= 5) {
            precoKGMaca = 1.80;
        } else {
            precoKGMaca = 1.50;
        }

        precoTotalMorango = qtdMorango * precoKGMorango;
    }
}
