package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.print("Informe a idade: ");
//        int idade = scan.nextInt();
//
//        if (idade >= 18) {
//            System.out.println("É maior de idade");
//
//        } else {
//            System.out.println("Não é maior de idade");
//        }

//               Segundo Exemplo
        System.out.print("Informe o preço do item: ");
        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else { // valor maior ou igual a 17
            System.out.println("Esta muito caro");
        }
    }
}
