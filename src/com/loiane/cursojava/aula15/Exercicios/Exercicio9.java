package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int n2 = scan.nextInt();

        System.out.print("Informe o terceiro número: ");
        int n3 = scan.nextInt();

//        Resolvendo a questão com else if
        if (n1 <= n2 && n1 <= n3 && n2 <= n3) {
            System.out.println(n3 + " - " + n2 + " - " + n1);
        } else if (n1 <= n2 && n1 <= n3 && n3 <= n2) {
            System.out.println(n2 + " - " + n3 + " - " + n1);
        } else if (n2 <= n1 && n2 <= n3 && n1 <= n3) {
            System.out.println(n3 + " - " + n1 + " - " + n2);
        } else if (n2 <= n1 && n2 <= n3 && n3 <= n1) {
            System.out.println(n1 + " - " + n3 + " - " + n2);
        } else if (n3 <= n1 && n3 <= n3 && n1 <= n2) {
            System.out.println(n2 + " - " + n1 + " - " + n3);
        } else if (n3 <= n1 && n3 <= n3 && n1 <= n2) {
            System.out.println(n1 + " - " + n2 + " - " + n3);
        }
    }
}
