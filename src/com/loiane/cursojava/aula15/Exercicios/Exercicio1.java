package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double n1 = scan.nextDouble();

        System.out.print("Informe o segundo número: ");
        double n2 = scan.nextDouble();

        if (n1 > n2) {
            System.out.println(n1 + " É maior que:  " + n2);
        } else {
            System.out.println(n2 + " É maior que:  " + n1);
        }
    }
}
