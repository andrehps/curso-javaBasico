package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        formula equação do segundo grau: ax2 + bx + c
        double a, b, c, delta;

        System.out.print("Informe o valor de A: ");
        a = scan.nextDouble();

        if (a == 0) {
            System.out.print("Não é equação de segundo grau ");
        } else {
            System.out.print("Informe o valor B: ");
            b = scan.nextDouble();

            System.out.print("Informe o valor C: ");
            c = scan.nextDouble();

            delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println(" \n Delta negativo");
            } else {

                System.out.print("O Valor de Delta: " + delta + " \n ");
                double x1 = ((-b) + Math.sqrt(delta) * (2 * a));
                double x2 = ((-b) - Math.sqrt(delta) * (2 * a));

                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
            }
        }
    }
}
