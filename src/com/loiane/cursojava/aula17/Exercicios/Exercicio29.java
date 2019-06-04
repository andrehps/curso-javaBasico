package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Informe um número: ");
        num = scan.nextInt();

        boolean primo;
        for (int i = 1; i < num; i++) {

            primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
//                    System.out.println("Não é primo - divisível por " + i);
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}
