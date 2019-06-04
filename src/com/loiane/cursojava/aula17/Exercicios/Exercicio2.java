package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome, senha = "";

        /*   1º jeito de fazer    System.out.print("informe o nome: ");
        nome = scan.next();

        System.out.print("informe a senha: ");
        senha = scan.next();

//        1º jeito de fazer
              if (senha.equalsIgnoreCase(nome)) {
            System.out.println("A senha não pode ser igual ao nome!");

            System.out.println("Digite novamente!");

        } else {
            System.out.println("Cadastro realizado com sucesso!");
//            }*/
//        2º jeito de fazer, pode-se usar flag infoVlaida = false e ir alterando mas eu prefeir usar equalsIgnoreCase. 
        boolean infoValida = false;
        do {
            System.out.print("informe o nome: ");
            nome = scan.next();

            System.out.print("informe a senha: ");
            senha = scan.next();

            if (senha.equalsIgnoreCase(nome)) {
                infoValida = true;
                System.out.println("A senha não pode ser igual ao nome!");

                System.out.println("Digite novamente!");

            } else {
                infoValida = false;
                System.out.println("Cadastro realizado com sucesso!");
            }
        } while (infoValida);
    }
}
