/*
Escribe un programa que lea del teclado una letra e imprima su carácter ASCII
así como los tres siguientes caracteres:
Introduce un carácter: E
Código ASCII de E es 69
Los tres siguientes caracteres son: F - G - H
 */

import java.util.Scanner;

public class U01ejerc12 {
    public static void main(String args[]){

        Scanner sc;
        char letra;

        sc = new Scanner(System.in);

        System.out.println("Introduzca un carácter: ");
        letra = sc.nextLine().charAt(0);

        System.out.println("El código ASCII de la letra " + letra + " es: " + ((int) letra));
        System.out.println("Los tres siguientes caracteres son: " + ((char)(letra + 1)) + ", " +
                ((char)(letra + 2)) + " y " + ((char)(letra + 3)));
    }
}
