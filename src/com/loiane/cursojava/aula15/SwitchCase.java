package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diaSemana = scan.nextInt();

        System.out.print("Informe um dia da semana de (1-7): ");

//        if (diaSemana == 1) {
//            System.out.println("Domingo");
//        } else if (diaSemana == 2) {
//            System.out.println("Segunda");
//        } else if (diaSemana == 3) {
//            System.out.println("Terça");
//        } else if (diaSemana == 4) {
//            System.out.println("Quarta");
//        } else if (diaSemana == 5) {
//            System.out.println("Quinta");
//        } else if (diaSemana == 6) {
//            System.out.println("Sexta");
//        } else if (diaSemana == 7) {
//            System.out.println("Sabado");
//        } else {
//            System.out.println("Não é um dia da semana válido");
//        }
        
        switch (diaSemana) {
            case 1: System.out.println("Domingo");break;
            case 2: System.out.println("Segunda");break;
            case 3: System.out.println("Terça");break;
            case 4: System.out.println("Quarta");break;
            case 5: System.out.println("Quinta");break;
            case 6: System.out.println("Sexta");break;
            case 7: System.out.println("Sabado");break;
            default: System.out.println("Não é um dia da semana válido");
        }
    }
}
