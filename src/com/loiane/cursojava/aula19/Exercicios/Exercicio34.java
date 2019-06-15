package com.loiane.cursojava.aula19.Exercicios;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Analizando o vetorA: " + vetorA[i]);

            for (int j = 2; j < vetorA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " é par");
                }
            }
            System.out.println();
        }
    }
}
