package com.loiane.cursojava.aula17;

public class aual17 {

    public static void main(String[] args) {
        double l = 1.4;

        for (int i = 0; i < 5; i++) {
            System.out.println("i tem o valor de: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i =" + i + "; j =" + j);
        }

        int count = 0;

        for (; count < 5;) {
            System.out.println("Valor de count: " + count);
            count += 1;

        }

        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println("VALOR de cont: " + cont);
        }

        int soma = 0;
        for (int i = 1; i < 5; soma += i++) {
            System.out.println("O valor da soma é: " + soma); // For sem chaves // Curiosidade.

            /*loop melhorado
            Muito utilizado com Arrays;*/
        }
    }
}
