package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1;

        System.out.println("Digite um número inteiro: ");
        n1 = scan.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("O número é Par");
        } else {
            System.out.println("O número é Ímpar");
        }
    }
}
