package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double qtdPessoas,
                somaIdades = 0,
                mediaIdades = 0;

        int idade;

        System.out.print("Quantidade de pessoas: ");
        qtdPessoas = scan.nextDouble();

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.print("Informe a sua idade ");
            idade = scan.nextInt();

            somaIdades += idade;
            mediaIdades = somaIdades / qtdPessoas;
        }

        if (mediaIdades >= 0 && mediaIdades <= 25) {
            System.out.println("Jovem");
        } else if (mediaIdades >= 26 && mediaIdades <= 26) {
            System.out.println("Adulta");
        } else {
            System.out.println("Idosa");
        }
        /*        System.out.println("A Média das idades é: " + mediaIdades);
                  System.out.println("A soma das idades é: " + somaIdades);
         */
    }
}
