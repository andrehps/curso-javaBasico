package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = scan.nextInt();

        System.out.println(num + "! = ");
        int fatorial = 1;
        for (int i = num; i >= 1; i--) {
            fatorial *= i;
            System.out.print(i + " . ");
        }
        System.out.println(" 1 = " + fatorial);
    }
}
