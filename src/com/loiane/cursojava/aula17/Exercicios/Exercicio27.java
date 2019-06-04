package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        String contInformando;

        double qtdTemp,
                temperatura,
                menor = Double.MIN_VALUE,
                maior = Double.MAX_VALUE,
                soma = 0;
        do {

            System.out.println("Deseja informar as temperaturas ?");
            contInformando = scan.next();

            if (contInformando.equalsIgnoreCase("s")) {

                System.out.println("Informe a quantidade de temperatura: ");
                qtdTemp = scan.nextDouble();

                for (int i = 1; i <= qtdTemp; i++) {
                    System.out.print("Informe a temperatura: " + i);
                    temperatura = scan.nextDouble();

                    soma += temperatura;

                    if (temperatura > maior) {
                        maior = temperatura;
                    }

                    if (temperatura < menor) {
                        menor = temperatura;
                    }
                }
                System.out.println("Média: " + (soma / qtdTemp));
                System.out.println("Maior:  " + maior);
                System.out.println("Menor:  " + menor);
            } else {
                sair = true;
            }
        } while (!sair);
    }
}
