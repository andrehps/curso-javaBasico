package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double nota;

        boolean notaValida = false; // Usando flag

        do {
            System.out.print("Informe uma nota de 0 a 10: ");
            nota = scan.nextDouble();
            
            
            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                
                System.out.println("Você digitou " + nota + "\n");
            } else {
                //notaValida = false;
                System.out.println("nota inválida, digite novamente.");
            }
        } while (!notaValida);

    }
}
