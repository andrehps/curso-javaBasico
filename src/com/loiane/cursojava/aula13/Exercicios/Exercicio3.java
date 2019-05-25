package com.loiane.cursojava.aula13.Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double n1;
        double n2;
        double resp;

        System.out.print("Informe o primeiro número: ");
        n1 = teclado.nextDouble();

        System.out.print("Informe o segundo número: ");
        n2 = teclado.nextDouble();

        System.out.print("Informe o primeiro número: ");

        resp = n1 + n2;

        System.out.print("O Resultado da soma é: " + resp);
    }
}
