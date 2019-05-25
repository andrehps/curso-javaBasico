package com.loiane.cursojava.aula13.Exercicios;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo para Download em MB: ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.print("Informe a velocidade de Internet em Mbps: ");
        double veloInternet = scan.nextDouble();
        double tempoDownload = (tamanhoArquivo / veloInternet);
        System.out.println("O tempo estimado é de : " + tempoDownload);
    }
}
