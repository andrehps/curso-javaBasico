package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, resultado;

        System.out.print("Informe um número: ");
        n1 = scan.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            resultado = n1 * i;
            System.out.println("tabuada: " + n1 + " X " + i + " = " + resultado);
        }
    }
}
