package com.company;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        boolean repeat = false;
        do {
            System.out.println("Digite a hora em formato 24hrs(00:00) para se convertida em formato 12Hrs(0:00 AM/PM)");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite as horas");
            String horasS = sc.nextLine();
            System.out.println("Digite os minutos");
            String minutosS = sc.nextLine();

            int horasI = Integer.parseInt(horasS);
            int minutosI = Integer.parseInt(minutosS);

        }while (repeat);
    }
    public static int converterEmInt (String horasS){
        int horasI = Integer.parseInt(horasS);
        if (horasI > 12){
            horasI = horasI - 12;
        }else if (horasI <= 12){
            horas
        }
        return horasI;
    }

}
