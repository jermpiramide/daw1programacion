// Realiza un programa que nos diga cuantos dígitos tiene un número entero introducido por
// teclado.

import java.util.Scanner;

public class U02ejemp11 {
    public static void main(String args[]){

        Scanner sc;
        int numero, digitos;

        digitos = 1; //Empezamos en 1 porque para números <10 (un sólo dígito) nuestro
                     // algoritmo arroja esta cifra directamente.

        sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero: ");
        numero = sc.nextInt();

        while(numero/10 >=1){
            digitos ++;
            numero = numero/10; //Al dividir entre 10 reducimos el número en un dígito u orden de magnitud.
        }

        System.out.printf("El número tiene %d dígitos.", digitos);
    }
}
