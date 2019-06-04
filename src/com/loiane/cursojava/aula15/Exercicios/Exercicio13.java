package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int diaSemana;

        System.out.println("Escolha um número: \n (1 - Domingo) | (2 - Segunda) | (3 - Terça) | (4 - Quarta) | (5 - Quinta) | (6 - Sexta) | (7 - Sábado)");
        diaSemana = scan.nextInt();

        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaSemana == 3) {
            System.out.println("Terça");
        } else if (diaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaSemana == 6) {
            System.out.println("Sábado");
        } else {
            System.out.println("Dia da semana inválido!");
        }
    }
}
