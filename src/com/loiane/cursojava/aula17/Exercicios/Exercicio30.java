package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdInicio, qtdFim;
        boolean valido = false;

        System.out.println("Digite o ínicio da tabuada");
        qtdInicio = scan.nextInt();

        System.out.println("Digite o fim da tabuada");
        qtdFim = scan.nextInt();
//        Usando do while / if else / flag / break  - treino.
        do {
            if (qtdFim > qtdInicio) {
                for (int i = qtdInicio; i <= qtdFim; i++) {
                    System.out.println("Tabuada do: " + qtdInicio + " * " + i + " = " + qtdInicio * i);
                    valido = true;
                }
            } else{
                System.out.println("O segundo valor não pode ser menor que o primeiro!");
                valido = false;
                break;
            }

        } while (!valido);
    }
}
