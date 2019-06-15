package com.loiane.cursojava.aula19.Exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        //         Lembrar: A primeira posição do vetor começa em 0
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe um valor do vetorA posição: " + i + " : ");
            vetorA[i] = scan.nextInt(); // Atribuindo os valores do Vetor
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Informe um valor do vetorB posição: " + i + " : ");
            vetorA[i] = scan.nextInt(); // Atribuindo os valores do Vetor
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe um valor do vetorA posição: " + i + " : ");
            vetorB[i] = scan.nextInt(); // Atribuindo os valores do Vetor

        }

        for (int i = 0; i < vetorC.length; i++) {

            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("\n -------------------------");
        System.out.print("Vetor A =  ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\n -------------------------");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\n -------------------------");

        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");

    }
}
