package com.company;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        System.out.println("Digite tres numeros");
        Scanner numInput = new Scanner(System.in);
        int[] numeros = new int[3];
        for (int i=0; i< numeros.length;i++){
            numeros[i] = numInput.nextInt();
        }
        System.out.println("Soma dos valores recebidos: " +soma(numeros));
    }
    public static int soma(int[] numeros){
        return (numeros[0]+numeros[1]+numeros[2]);
    }
}
