package com.loiane.cursojava.aula13.Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String resp;
        System.out.print("Informe um número: ");
        resp = teclado.next();

        System.out.println("O Número digitado foi: " + resp);
    }
}
