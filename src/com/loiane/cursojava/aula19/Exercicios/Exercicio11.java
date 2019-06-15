package com.loiane.cursojava.aula19.Exercicios;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        double soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor da posição: ");
            vetorA[i] = scan.nextInt();

        }

        int qtdPares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                qtdPares = qtdPares + 1;
                //qtdPares ++;
            }
        }
        
        System.out.println("VetorA = ");
        
        for (int i = 0; i <vetorA.length ; i++) {
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Qtd Números Pares: " + qtdPares);
    }
}
