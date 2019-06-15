package com.loiane.cursojava.aula19.Exercicios;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }
        double SomaMenor15 = 0;
        double igual15 = 0;
        double SomaMaior15 = 0;
        double QtdMaior15 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 15) {
                igual15++;
            } else if (vetorA[i] <=15) {
                SomaMenor15 += vetorA[i];
            } else if (vetorA[i] > 15) {
                QtdMaior15++; 
                SomaMaior15 += vetorA[i];
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Quantidade de números == 15 " + igual15);
        System.out.println("Quantidade de < 15: " + igual15);
        System.out.println("A média dos números >  15: " + SomaMaior15 / QtdMaior15);
        
    }
}
