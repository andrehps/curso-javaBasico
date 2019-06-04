package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int base, pot;

        System.out.print("Informe com a Base: ");
        base = scan.nextInt();

        System.out.print("Informe a potência: ");
        pot = scan.nextInt();

        //2^3 = 2*2*3
        int resultado = base;
        for (int i = 1; i < pot; i++) {
            resultado = resultado * base;
        }
        System.out.println("Resultado: " + resultado);
    }

}
