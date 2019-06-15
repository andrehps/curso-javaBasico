package com.loiane.cursojava.aula19.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int [15];
        double[] vetorB = new double[vetorA.length];

//         Lembrar: A primeira posição do vetor começa em 0
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe um valor da posição: " + i + " : ");
            vetorA[i] = scan.nextInt(); // Atribuindo os valores do Vetor
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\n -------------------------");
        
        DecimalFormat df = new DecimalFormat("###,##.###");  
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }
        System.out.println("");

    }
}
