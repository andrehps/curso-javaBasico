package com.loiane.cursojava.aula13.Exercicios;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double IR = (salarioBruto / 100) * 11;
        double totalDesconto = inss + sindicato + IR;

        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.print("Salario bruto " + salarioBruto);
        System.out.print("INSS: " + inss);
        System.out.print("Sindicato: " + sindicato);
        System.out.print("Imposto de renda: " + IR);
        System.out.println("Total de desconto: " + totalDesconto);
        System.out.println("Salário liquido: " + salarioLiquido);
    }
}
