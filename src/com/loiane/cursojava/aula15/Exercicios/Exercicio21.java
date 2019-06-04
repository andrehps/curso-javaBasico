package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double litros,
                precoGas = 2.50,
                precoAlc = 1.90,
                total = 0,
                totalDesconto,
                precoAPagar;

        String tipo;
        int percDesconto = 0;

        System.out.print("Informe q qtd de litros vendidos: ");
        litros = scan.nextByte();

        System.out.print("Informe o tipo de combustível: ");
        tipo = scan.next();

        if (tipo.equalsIgnoreCase("a")) {
            if (litros <= 20) {
                percDesconto = 3;
            } else if (litros > 20) {
                percDesconto = 5;
            }

            total = litros * precoAlc;

        } else if (tipo.equalsIgnoreCase("g")) {
            if (litros <= 20) {
                percDesconto = 4;
            } else if (litros > 20) {
                percDesconto = 6;
            }
            
            total = litros * precoGas;
        }
        totalDesconto = (total / 100) * percDesconto;
        precoAPagar = total - totalDesconto;
        
        System.out.println("Valor a ser pago: " + precoAPagar);
    }
}
