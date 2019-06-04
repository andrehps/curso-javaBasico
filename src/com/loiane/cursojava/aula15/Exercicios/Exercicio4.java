package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com uma letra: ");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("vogal");
        } else {
            System.out.println("Consoante");
        }
    }

}
