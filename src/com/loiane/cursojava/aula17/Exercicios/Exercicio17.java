package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, fatorial;

        System.out.print("Digite um número: ");
        num = scan.nextInt();

        System.out.println(num + "! = ");

        fatorial = 1;

        for (int i = num; i > 0; i--) {
            fatorial *= i;
            System.out.print(" " + i);
        }
        System.out.println(" \n Resultado: " + fatorial);
    }
}
