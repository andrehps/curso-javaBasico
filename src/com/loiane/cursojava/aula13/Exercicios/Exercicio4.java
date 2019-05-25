package com.loiane.cursojava.aula13.Exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.print("Informe a primeira nota: ");
        nota1 = teclado.nextDouble();

        System.out.print("Informe a segunda nota: ");
        nota2 = teclado.nextDouble();

        System.out.print("Informe a terceira nota: ");
        nota3 = teclado.nextDouble();

        System.out.print("Informe a quarta nota: ");
        nota4 = teclado.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("A média das notas é: " + media);
    }
}
