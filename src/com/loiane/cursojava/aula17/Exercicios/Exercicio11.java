package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0,
                n1 = 0,
                n2 = 0;

        System.out.print("Informe o primeiro número: ");
        n1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        n2 = scan.nextInt();

        for (int i = n1; i <= n2; i++) {
            System.out.println(i);

            soma = soma + i;
        }
        System.out.println("Soma: " + soma);
    }
}
