package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0,
                n2 = 0;

        System.out.print("Informe o primeiro número: ");
        n1 = scan.nextInt();
        
        System.out.print("Informe o segundo número: ");
        n2 = scan.nextInt();
        
        for (int i = n1; i < n2; i++) {
            System.out.println(i);
        }
    }
}
