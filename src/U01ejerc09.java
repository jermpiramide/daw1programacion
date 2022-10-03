/*
Escribe un programa que lea del teclado un tiempo transcurrido en segundos y
muestre por pantalla las semanas, días, horas, minutos y segundos equivalentes.
 */

import java.util.Scanner;

public class U01ejerc09 {
    public static void main(String arg[]){

        Scanner sc;

        int segundos, minutos, horas, dias, semanas;

        sc = new Scanner(System.in);

        System.out.println("Introduzca el tiempo en segundos: ");

        segundos = sc.nextInt();

        minutos = segundos/60;
        segundos = segundos%60;
        horas = minutos/60;
        minutos = minutos%60;
        dias = horas/24;
        horas = horas%24;
        semanas = dias/7;
        dias = dias%7;

        System.out.printf("Segundos=%d%nMinutos=%d%nHoras=%d%nDías=%d%nSemanas=%d%n", segundos, minutos, horas, dias, semanas);
    }
}
