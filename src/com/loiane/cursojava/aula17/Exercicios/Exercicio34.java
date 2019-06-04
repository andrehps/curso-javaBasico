package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n,
                h = 1,
                soma = 0;

        System.out.print("Informe o valor de N: ");
        n = scan.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.print(h + "/" + (i + h) + " + ");

            soma += 1 / i;
        }

        System.out.println("\n Soma: " + soma);
    }
}
