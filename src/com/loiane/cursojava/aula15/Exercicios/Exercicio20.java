package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resp1, resp2, resp3, resp4, resp5;

        System.out.print("Responda as perguntas abaixo com (S - Sim | N - Não) . \n");

        System.out.println("Telefonou para a vítima ?");
        resp1 = scan.next();

        System.out.println("Esteve no local do crime ?");
        resp2 = scan.next();;

        System.out.println("Mora perto da vítima ?");
        resp3 = scan.next();

        System.out.println("Devia para a vítima ?");
        resp3 = scan.next();

        System.out.println("Já trabalhou com a vítima ?");
        resp4 = scan.next();

        System.out.println("Brigou com vítima ?");
        resp5 = scan.next();

        int cont = 0;
        if (resp1.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp2.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp3.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp4.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp5.equalsIgnoreCase("S")) {
            cont++;
        }

        if (cont == 2) {
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice");
        } else if (cont == 5) {
            System.out.println("Assassino");
        } else if (cont == 0) {
            System.out.println("Inocente");
        }

    }
}
