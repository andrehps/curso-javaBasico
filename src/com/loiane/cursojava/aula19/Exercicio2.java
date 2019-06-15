package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length]; //

//         Lembrar: A primeira posição do vetor começa em 0
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe um valor da posição: " + i + " : ");
            vetorA[i] = scan.nextInt(); // Atribuindo os valores do Vetor
            vetorB[i] = vetorA[i] * 2;

        }

        // Imprimir os valores do vetorA e vetorB  que foi multiplicado por 2;
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + "");
        }
        System.out.println("\n -------------------------");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");
    }
}
