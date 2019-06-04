package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome, sexo, estadoCivil;
        int idade = 0;
        double salario = 0;
        boolean infoValida = false;

        do {
            System.out.print("Nome com mais de 3 caracteres: ");
            nome = scan.next();

            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa de no mínimo de 3 caracteres!");
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.print("Entre com a idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150!");
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.print("Informe o salário: ");
            salario = scan.nextInt();

            if (salario >= 0) {
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0!");
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.print("Inform o sexo: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") | sexo.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser (F ou M)");
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.print("Informe o E stado Civil: 's' 'c' 'v' 'd' ");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") | estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("Estado Civil precisa ser 's' 'c' 'v' 'd' ");
            }

        } while (!infoValida);
        System.out.println("\n As seguintes informações foram coletadas:");
        System.out.println("Nome:  " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Gênero: " + sexo);
        System.out.println("Salário: " + salario);

//        System.out.print("Idade entre 0 e 150: ");
//        idade = scan.nextInt();
//
//        System.out.print("Salário maior que zero: ");
//        salario = scan.nextDouble();
//        
//        System.out.print("Sexo F ou M: ");
//        salario = scan.nextDouble();
//        
//        System.out.print("Estado Civil: (s)");
//        salario = scan.nextDouble();
    }
}
