/*
Escribe un programa que pasa de dólares a euros.
 */

import java.util.Scanner;

public class U01ejerc07 {
    public static void main(String arg[]){

        Scanner sc;
        final double RATIOEURODOLAR;
        double cantidadeuros, cantidaddolares;

        sc = new Scanner(System.in);

        System.out.println("Introduzca el ratio euro/dolar: ");
        RATIOEURODOLAR = sc.nextDouble();
        System.out.println("Introduzca la cantidad de dolares a convertir a euros: ");
        cantidaddolares = sc.nextDouble();

        cantidadeuros = cantidaddolares*RATIOEURODOLAR;

        System.out.printf("La cantidad en euros es: %.5f €.", cantidadeuros);
    }
}