package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1;
        System.out.print("Informe um número: ");
        n1 = scan.nextDouble();

        if (n1 >= 0) {
            System.out.print("O número é positivo!");
        } else {
            System.out.println("O número informado é negativo!");
        }
    }
}
