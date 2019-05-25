package com.loiane.cursojava.aula13.Exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;
        System.out.println("A temperatura " + c + " C é igual a " + f + " F"); 
    }
}
