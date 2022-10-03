/*
Escribe un programa que solicite la longitud y anchura en metros de una
 habitación e imprima su superficie con cuatro decimales.
 */

import java.util.Scanner;

public class U01ejerc10 {
    public static void main(String arg[]) {

        Scanner sc;
        double longitud, anchura, superficie;

        sc = new Scanner(System.in);

        System.out.println("Introduzca los valores de longitud y anchura en este orden y separados por un espacio: ");
        longitud = sc.nextDouble();
        anchura = sc.nextDouble();

        superficie = longitud * anchura;

        System.out.println("Superficie=" + superficie + " u²");
    }
}
