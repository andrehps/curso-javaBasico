package com.loiane.cursojava.aula19.Exercicios;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int MaiorIdade = 0;
        int MenorIdade = 0;
        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a idade de sua posição: " + i);
            idades[i] = scan.nextInt();
        }

        int menor = idades[0];
        int indexMenor = 0;
        int maior = idades[0];
        int indexMaior = 0;

        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                indexMaior = i;

            } else if (idades[i] < menor) {
                menor = idades[i];
                indexMenor = i;
            }

        }
        System.out.print("Vetor de Idades: ");
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i] + " ");

        }

        System.out.println();
        System.out.println("Menor idade: " + menor);
        System.out.println("Índice menor idade: " + indexMenor);

        System.out.println("Maior idade: " + maior);
        System.out.println("Índice maior idade: " + indexMaior);
    }
}
