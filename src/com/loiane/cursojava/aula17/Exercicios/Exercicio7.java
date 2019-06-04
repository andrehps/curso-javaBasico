package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe com um número: ");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("O número maior mudou: " + maior);
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}
