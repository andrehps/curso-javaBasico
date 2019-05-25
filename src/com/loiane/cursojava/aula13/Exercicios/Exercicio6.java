package com.loiane.cursojava.aula13.Exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final double Pi = 3.1416F;
        double raio, a;

        System.out.print("Infome o raio do círculo:  ");
        raio = teclado.nextDouble();

//        a = Pi * (raio * raio);
          a = Math.PI * Math.pow(raio, 2);

        System.out.print("A área do círculo é: " + a + " M \n");
    }
}
