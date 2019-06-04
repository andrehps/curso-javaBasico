package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String turno;

        System.out.print("Em que turno você estuda ? ");
        turno = scan.next();

        if (turno.equalsIgnoreCase("m")) {
            System.out.println(" Bom dia!");
        } else if (turno.equalsIgnoreCase("v")) {
            System.out.println(" Boa tarde! ");
        } else if (turno.equalsIgnoreCase("n")) {
            System.out.println(" Boa noite!");
        } else{
            System.out.println(" Turno inválido!");
        }
    }
}
