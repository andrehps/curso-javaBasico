package com.loiane.cursojava.aula19.Exercicios;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            soma = soma + vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Soma dos números da posição: " + soma);
    }
}
