package com.loiane.cursojava.aula17.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salario = 1000; // 95

        double percentual = 1.5; // 96
        
        DecimalFormat format = new DecimalFormat("###,###.##");
        
        salario += (salario / 100) * percentual; // 96

        for (int i = 1997; i <= 2015; i++) {
            percentual *= 2;

            salario += (salario / 100) * percentual;
            System.out.println(i + " = "+ format.format(salario) + salario + " - " + percentual + "%");
        }
    }
}
