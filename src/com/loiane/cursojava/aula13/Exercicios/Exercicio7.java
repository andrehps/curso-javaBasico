package com.loiane.cursojava.aula13.Exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Infome o lado do quadrado: ");
        double lado = scan.nextDouble();

        // area é lado * lado
        double a = Math.pow(lado, lado);

        System.out.println("A área do quadrado é: " + a);
        System.out.println("O dobro da área do quadrado é: " + (a * 2));
    }
}
