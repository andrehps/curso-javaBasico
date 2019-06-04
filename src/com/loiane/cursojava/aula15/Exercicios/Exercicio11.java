package com.loiane.cursojava.aula15.Exercicios;

import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salario, aumento, salarioAjustado;
        int percentual = 0;

        System.out.print("Informe o salário: ");
        salario = scan.nextDouble();

        if (salario <= 280) {
            percentual = 20;
        } else if (salario > 280 && salario <= 700) {
            percentual = 15;
        } else if (salario > 700 && salario < 1500) {
            percentual = 10;
        } else if (salario >= 1500) {
            percentual = 5;
        }

        aumento = (salario / 100) * percentual;
        salarioAjustado = salario + aumento;

        System.out.println("Salário: " + salario);
        System.out.println("Percentual: " + percentual + " % ");
        System.out.println("Aumento: " + aumento);
        System.out.println("Salário ajustado: " + salarioAjustado);
    }
}
