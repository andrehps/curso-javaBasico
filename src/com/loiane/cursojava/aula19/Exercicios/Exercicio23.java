package com.loiane.cursojava.aula19.Exercicios;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int Pares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os valores da posição: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0) {
                break;
            }
        }
    }
}