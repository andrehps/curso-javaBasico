package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        double tempDia001 = 31.3,
                tempDia002 = 32,
                tempDia003 = 33.7,
                tempDia004 = 34,
                tempDia005 = 33.1;

        //Boas práticas de ~programação Java -> tipo da var [] nomeVar = new double [valorVar] / 
        double[] temperaturas = new double[365];
//        Acessar uma temperatura / var [indiceDaPosicao] = colocarValor;
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[2]);

        System.out.println("O tamanho do array: " + temperaturas.length); // quantos foram setados na memoria;

        System.out.println("Valor do array: ");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia: " + (i + 1) + temperaturas[i]);
        }

        //for melhorado
        
        /*     for (double temp : temperaturas) {
                System.out.println(temp);
        }*/
    }
}
