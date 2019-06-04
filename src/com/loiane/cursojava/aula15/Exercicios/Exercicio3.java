package com.loiane.cursojava.aula15.Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // -- exemplo -- Usando Variável tipo char         
        System.out.print("Digite a letra  (F ou M ): ");
        char letra = scan.next().charAt(0);

        if (letra == 'F' || letra == 'f') {
            System.out.print(letra + "\n Sexo Feminino \n");
        } else if (letra == 'M' || letra == 'm') {
            System.out.println(letra + "\n Sexo Masculino \n");
        } else {
            System.out.println("\n Sexo inválido! \n");
        }  
//             Validação usando o .length
        /*        if (letra.length() > 1 ) {
            System.out.println("Não é uma letra válida!");
        } else {
            switch (letra) {
                case "a": 
                case "e": 
                case "i": 
                case "o": 
                case "u": 
                case "A": 
                case "E": 
                case "I": 
                case "O": 
                case "U":  System.out.println("Vogal"); break;
                default:System.out.println("Consoante");
            }
        }*/
    }
}
