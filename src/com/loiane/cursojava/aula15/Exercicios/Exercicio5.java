package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.print("Informe a primeira nota: ");
        n1 = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        n2 = scan.nextDouble();

        System.out.print("Informe a terceira nota: ");
        n3 = scan.nextDouble();

        media = (n1 + n2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com Distinção!");
        } else 
            if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
