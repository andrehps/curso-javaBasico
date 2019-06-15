package com.loiane.cursojava.aula19.Exercicios;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                impar++;
            }
        }
        int par = vetorA.length - impar;

        //vetorA.length - 100%;
        //par
        //x * vetorA.length ==  par * 100
        // = x (par * 100)/vetorA.length;
        double porPar = (par * 100) / vetorA.length;
        double porImpar = 100 - porPar;

        System.out.print("Vetor A =");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");

        }
        System.out.println();
        System.out.println("Porcentagem Pares: " + porPar);
        System.out.println("Porcentagem Ímpares: " + porImpar);
    }
}
