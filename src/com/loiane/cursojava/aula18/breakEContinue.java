package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class breakEContinue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, max;

        System.out.print("informe com um número:");
        num = scan.nextInt();

        System.out.print("informe limite:");
        max = scan.nextInt();

        for (int i = num; i <= max; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                System.out.println("O valor de i: " + i);
//                break;
//                continue;
            }
        }
    }
}
