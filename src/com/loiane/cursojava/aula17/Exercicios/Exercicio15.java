package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = 0;
        System.out.print("Entre com o n-ésimo termo da série de fibonacci: ");
        n = scan.nextInt();

        int primeiro = 1,
                segundo = 1,
                proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
    }
}
