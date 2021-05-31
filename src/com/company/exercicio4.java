package com.company;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        System.out.println("Insira um número para indentificação: P= Positivo N=Negativo Z= Zero");
        Scanner numInput = new Scanner(System.in);
        double numero = numInput.nextDouble();
        char verificador2 = verificarParImpar(numero);
        exibirResultados(verificador2);
    }
    public static char verificarParImpar(double numero){
        char verificador;
        if (numero > 0){
             verificador = 'P';
        }else if (numero < 0 ){
             verificador = 'N';
        }else {
            verificador = 'Z';
        }
        return verificador;
    }
    public static void exibirResultados(char verificador2){
        switch (verificador2){
            case 'N':{
                System.out.println(verificador2 + ": Número negativo");
                break;
            }
            case 'P':{
                System.out.println(verificador2 + ": Número Positivo");
                break;
            }
            case 'Z':{
                System.out.println(verificador2 + ": O número é Zero");
                break;
            }
        }
    }
}
