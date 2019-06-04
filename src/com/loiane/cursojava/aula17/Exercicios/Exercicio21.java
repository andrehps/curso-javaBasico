package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numTurmas = 0,
                numAlunos = 0,
                soma = 0;

        boolean valido = true;
        double media = 0;

        System.out.print("Quantidade de turma:");
        numTurmas = scan.nextInt();

        for (int i = 1; i <= numTurmas; i++) {
            valido = true;

            System.out.print("Entre com o número de alunos da turma: ");
            numAlunos = scan.nextInt();
//            Trabalhando com for / do while / if else
            do {
                if (numAlunos <= 40) {
                    soma += numAlunos;
                    valido = true;
                } else {
                    valido = false;
                    System.out.println("Nâo pode ser mais que 40");
                    break;
                }
            } while (!valido);
        }

        media = (soma / numTurmas);
        System.out.println("A soma é: " + soma);
        System.out.println("A média: " + media);
    }
}
