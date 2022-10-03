/*
Escribe un programa que lea del teclado un número real de grados Fahrenheit y
lo convierta en Celsius mostrando el resultado en la pantalla. La fórmula
para pasar de grados Celsius es: ºC = 5/9 * (ºF - 32)
 */

import java.util.Scanner;

public class U01ejerc08 {
    public static void main(String arg[]){

        Scanner sc;
        double celsius, fahrenheit;

        sc = new Scanner(System.in);

        System.out.println("Introduzca la temperatura en ºF para convertirla en C: ");
        fahrenheit = sc.nextDouble();

        System.out.println(fahrenheit);
        celsius = (5.0/9)*(fahrenheit-32); // Forzamos los términos de la división para que el resultado sea decimal.

        System.out.printf("La temperatura es de %.2f C.", celsius);
    }
}