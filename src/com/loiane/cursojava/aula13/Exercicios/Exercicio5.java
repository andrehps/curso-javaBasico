package com.loiane.cursojava.aula13.Exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double metro, cm;

        System.out.print("Quantos metros: ");
        metro = teclado.nextDouble();

        cm = metro * 100;

        System.out.println(metro + " M é igual a " + cm + " CM");
    }
}
