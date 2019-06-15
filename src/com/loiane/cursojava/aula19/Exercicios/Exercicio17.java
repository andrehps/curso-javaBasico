package com.loiane.cursojava.aula19.Exercicios;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdPessoas = 0;
        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a posição das idades:" + i);
            idades[i] = scan.nextInt();

        }

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 35) {
                qtdPessoas++;
            }
        }

        System.out.print("Idade  = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }

        System.out.println();
        System.out.println("A quantidade de pessoas que possuem idade superior a 35 é de: " + qtdPessoas);
    }
}
