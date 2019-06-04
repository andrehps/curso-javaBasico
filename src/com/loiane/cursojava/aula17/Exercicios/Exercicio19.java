package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double qtdNotas,
                nota = 0,
                soma = 0,
                media = 0;

        System.out.print("Quantidade de notas: ");
        qtdNotas = scan.nextDouble();

        for (int i = 0; i < qtdNotas; i++) {
            System.out.print("Informe a nota: ");
            nota = scan.nextDouble();

//            soma += nota;
            soma = soma + nota;
            media += (nota / qtdNotas);
        }

        System.out.println("A Soma das notas é: :  " + soma);
        System.out.println("A média aritmética do número é:  " + media);
    }
}
