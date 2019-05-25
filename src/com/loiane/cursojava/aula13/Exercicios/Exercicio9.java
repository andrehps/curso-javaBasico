package com.loiane.cursojava.aula13.Exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em Farenheit: ");
        double f = scan.nextDouble();
        
        double c = (5 * (f - 32) / 9);
        System.out.println("A temperatura "+ f + " F é igual a "+ c + " C");
    }
}
