package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.print("Informe o lado 1: ");
        lado1 = scan.nextInt();

        System.out.print("Informe o lado 2: ");
        lado2 = scan.nextInt();

        System.out.println("Informe o lado 3: ");
        lado3 = scan.nextInt();

        /* Dicas:
        Três lados formam um triângulo quando a soma de quaisquer dois lados form maior que o terceiro;
        Triângulo Equilátero: três lado iguais;
        Triângulo Isósceles : quaisquer dois lados iguais;
        Triângulo Escaleno: três lados diferentes;
         */
        if ((lado1 + lado2 > lado3) || (lado1 + lado3 > lado2) || (lado2 + lado3 > lado1)) {
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            }
        } else {
            System.out.println("Não forma um triângulo");
        }
    }
}
