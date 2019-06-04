package com.loiane.cursojava.aula17.Exercicios;

import java.util.Scanner;

public class Exercicio25_1_Training {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        String continuarCompra,
                output;
        double qtdProdutos,
                precoProdutos,
                total,
                valorPago,
                troco = 0;

        do {
            System.out.println("Deseja informar uma nova compra S /N");
            continuarCompra = scan.next();

            if (continuarCompra.equalsIgnoreCase("s")) {
                output = "Lojas Tabajaras \n";

                System.out.print("informe a quantidade de produtos: ");
                qtdProdutos = scan.nextDouble();
                total = 0;

                for (int i = 1; i <= qtdProdutos; i++) {
                    System.out.println("Informe o preço do produto:" + i);
                    precoProdutos = scan.nextDouble();
                    total += precoProdutos;

                    output = "Produto: " + i + " R$ " + precoProdutos + " \n";
                }
                output = "Total: " + total;

                System.out.println("Total: R$" + total);

                System.out.print("Entre com o valor pago: ");
                valorPago = scan.nextDouble();

                output += "Dinheiro R$ " + valorPago + "\n";
                troco = total - valorPago;

                output += "Troco R$ " + troco;

                System.out.print("Troco: " + troco + "\n");

            } else {
                sair = true;
            }

        } while (!sair);

    }
}
