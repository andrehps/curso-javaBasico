package com.loiane.cursojava.aula17.Exercicios;

public class Exercicio24 {

    public static void main(String[] args) {

        System.out.println("Preço do Pão;  R$ 0.18");
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$ " + (0.18 * i));
        }
    }
}