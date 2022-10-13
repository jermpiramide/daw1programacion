//Escribe un programa que solicite un carácter por teclado e informe de si es alfanumérico (letra o dígito) o no.
//En caso de ser alfanumérico deberá indicar si es una letra o un dígito. En caso de ser una letra deberá informar
//de si es minúscula o mayúscula.

import java.util.Scanner;

public class U02ejerc05 {
    public static void main(String args[]){

        Scanner sc;
        char caracter;

        sc = new Scanner(System.in);

        System.out.println("Introduzca un carácter: ");
        caracter = sc.next().charAt(0);

        if (Character.isDigit(caracter)) {
            System.out.println("Es un número.");
        } else if (Character.isLetter(caracter)) {
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
