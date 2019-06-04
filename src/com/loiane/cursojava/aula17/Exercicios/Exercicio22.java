package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdCd;
        double precoCd,
                soma = 0,
                media = 0;

        System.out.print("Quantidade de CDs: ");
        qtdCd = scan.nextInt();

        for (int i = 1; i <= qtdCd; i++) {
            System.out.print("Informe o preço do CD:");
            precoCd = scan.nextDouble();

            soma += precoCd;

        }
        media = (soma / qtdCd);
        System.out.println("O valor médio investido em cada CD é de: " + media);
    }
}
