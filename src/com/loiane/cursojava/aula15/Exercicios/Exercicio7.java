package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int n2 = scan.nextInt();

        System.out.print("Informe o terceiro número: ");
        int n3 = scan.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " É maior");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " É maior");
        } else if (n3 >= n1 && n3 >= n2) {
            System.out.println(n3 + " É maior");
        }
        if (n1 <= n2 && n1 <= n3) {
            System.out.println(n1 + " É menor");
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2 + " É menor");
        } else if (n3 <= n1 && n3 <= n2) {
            System.out.println(n3 + " É menor");
        }
    }
}
