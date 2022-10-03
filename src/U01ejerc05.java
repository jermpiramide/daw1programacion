/*
Escribe un programa que defina la constante PI como 3.1416 que calcule e imprima el área de un círculo cuyo radio se
pide por pantalla. (área del círculo = PI*radio^2).
 */

import java.util.Scanner;

public class U01ejerc05 {
    public static void main(String args[]){

        Scanner sc;
        final double PI;
        double areapor, areapot, radio;

        sc = new Scanner(System.in);
        PI = 3.1416;

        System.out.println("Por favor, introduzca el valor del radio: ");
        radio = sc.nextDouble();

        areapor = PI*radio*radio;
        areapot = PI*Math.pow(radio, 2);

        System.out.println("El área del círculo es areapor= " + areapor + " u².");
        System.out.println("El área del círculo es areapot= " + areapot + " u².");
    }
}