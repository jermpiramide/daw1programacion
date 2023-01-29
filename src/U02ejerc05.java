/*
Escribe un programa que solicite un carácter por teclado e informe de si es alfanumérico (letra o dígito) o no.
En caso de ser alfanumérico deberá indicar si es una letra o un dígito. En caso de ser una letra deberá informar
de si es minúscula o mayúscula.
*/

import java.util.Scanner;

public class U02ejerc05 {
    public static void main(String args[]){

        Scanner sc;
        char caracter;

        sc = new Scanner(System.in);

        System.out.println("Introduzca un carácter: ");
        caracter = sc.next().charAt(0); // next() toma todos los caracteres introducidos hasta encontrar un delimitador
        // y los convierte en un String, independientemente de si el total de caracteres tomado es uno o más de uno.
        // Por ello, si queremos asignar a una variable únicamente un carácter del String y tomarlo como tipo char es
        // necesario utilizar el método charAt() indicando la posición en la que se encuentra el carácter dentro del
        // String tomado por next(). En nuestro caso la posición de interés es la posición 0.
        // También podemos utilizar nextLine() en lugar de next(), lo que toma todos los caracteres hasta encontrar un
        // salto de línea, y el resultado sería equivalente:
        // caracter = sc.nextLine().charAt(0);

        if (Character.isDigit(caracter)) {
            System.out.println("Es un número.");
        } else if (Character.isLetter(caracter)){
            if (Character.isUpperCase(caracter)){
                System.out.println("Es una letra mayúscula.");
            } else {
                System.out.println("Es una letra minúscula.");
            }
        } else {
            System.out.println("No es ni un número ni una letra.");
        }
    }
}
