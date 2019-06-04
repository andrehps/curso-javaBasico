package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1, n2, media;
        String aproveitamento = "", conceito = "";
        System.out.println("Informe a primeira nota: ");
        n1 = scan.nextDouble();

        System.out.println("Informe a segunda nota: ");
        n2 = scan.nextDouble();

        media = (n1 + n2) / 2;

        if (media < 4) {
            aproveitamento = " E ";
            conceito = "Reprovado";
        } else if (media >= 4 && media < 6) {
            aproveitamento = " D ";
            conceito = "Reprovado";
        } else if (media >= 6 && media < 7.5) {
            aproveitamento = " C ";
            conceito = "Aprovado";
        } else if (media >= 7.5 && media < 9) {
            aproveitamento = " B ";
            conceito = "Aprovado";
        } else if (media >= 9 && media == 10) {
            aproveitamento = " A ";
            conceito = "Aprovado";
        }

        System.out.println("Nota1: " + n1);
        System.out.println("Nota2: " + n2);
        System.out.println("Media: " + media);
        System.out.println("Conceito: " + aproveitamento);
        System.out.println(conceito);
    }
}
