package com.loiane.cursojava.aula13.Exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor/hora: ");
        double valorHora = scan.nextDouble();
        
        System.out.println("Informe as quatidade de horas trabalhadas no Mês");
        double horas = scan.nextDouble();
        
        double salario = valorHora * horas;
        System.out.println("o salário é de: "+ salario);
    }
}
