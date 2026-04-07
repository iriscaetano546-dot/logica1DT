package org.example;

import java.util.*;
public class cinco_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] numeros = new double [5];
        System.out.println("Digite cinco números: ");

        for(int i = 0; i < 5; i++){
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Números digitado: ");

        for(int i = 0; i <= 5; i++){
            System.out.println(numeros[i]);
        }

    }
}
