package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double soma = 0, media = 0, num = 0;

        for (double i = 0; i < 5; i++) {
            System.out.print("Informe o primeiro número: ");
            num = scan.nextDouble();

            soma = soma + num;

        }

        media = soma / 5;
        System.out.println("A soma das 5 notas é: " + soma);
        System.out.println("Média dos números é: " + media);
    }
}
