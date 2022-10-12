//Escribe un programa que lea un número entero por teclado e indique si es par o impar.

import java.util.Scanner;

public class U02ejerc01 {
    public static void main(String args[]){

        Scanner sc;
        int numero;

        sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero: ");
        numero = sc.nextInt();

        if ((numero%2) == 0){
            System.out.println("El número es par.");
        } else{
            System.out.println("El número es impar.");
        }
    }
}
