package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        System.out.println("Informe um número: ");
        num = scan.nextInt();

        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é primo - divisível por " + i);
                primo = false;
            }
        }
        if (primo) {
            System.out.println("É número primo");
        }
    }
}
