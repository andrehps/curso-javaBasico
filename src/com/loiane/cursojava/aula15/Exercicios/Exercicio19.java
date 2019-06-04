package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1, n2, resultado = 0;
        String escolha;
        boolean valida = true; //Fazendo um flag em programação 

        System.out.println("Entre com o primeiro número: ");
        n1 = scan.nextDouble();

        System.out.println("Entre com o segundo número: \n");
        n2 = scan.nextDouble();

        System.out.println("Entre com a operação: (+ - / *)");
        escolha = scan.next();

        if (escolha.equals("+")) {
            resultado = n1 + n2;
        } else if (escolha.equals("-")) {
            resultado = n1 - n2;
        } else if (escolha.equals("/")) {
            resultado = n1 / n2;
        } else if (escolha.equals("*")) {
            resultado = n1 * n2;
        }
        if (valida) {

            System.out.println("Resultado: " + resultado);
            if (resultado >= 0) {
                System.out.println("Resultado positivo");
            } else {
                System.out.println("Resultado negativo");
            }
            if (resultado % 2 == 0) {
                System.out.println("Resultado Par");
            } else {
                System.out.println("Resultado Ínpar");
            }
        }
    }
}
