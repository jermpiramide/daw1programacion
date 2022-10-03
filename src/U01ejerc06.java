/*
Escribe un programa que pase de euros a dólares (1€ = 1,1755$).
 */

import java.util.Scanner;

public class U01ejerc06 {
    public static void main(String arg[]){

        Scanner sc;
        final double RATIOEURODOLAR;
        double cantidadeuros, cantidaddolares;

        sc = new Scanner(System.in);

        System.out.println("Introduzca el ratio euro/dolar: ");
        RATIOEURODOLAR = sc.nextDouble();
        System.out.println("Introduzca la cantidad de euros a convertir a dólares: ");
        cantidadeuros = sc.nextDouble();

        cantidaddolares = cantidadeuros/RATIOEURODOLAR;

        System.out.printf("La cantidad en dólares es: $%.5f.", cantidaddolares);
    }
}