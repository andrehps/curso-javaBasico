package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;
        double soma = 0;

        System.out.print("Informe o valor de N: ");
        n = scan.nextInt();

        //Utilizando mais de um variável dentro do for
        for (int i = 1, j = 1; i <= n; i++, j += 2) {
            System.out.print(i + "/" + j + " + ");
            soma += i / j;
        }

        System.out.println("\n Soma: " + soma);
    }
}
