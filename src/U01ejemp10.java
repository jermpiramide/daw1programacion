//Escribe un programa en el que se definan dos variables y se intercambie el valor que contienen, imprimiendo el
//resultado por pantalla. Pista: Necesitaremos utilizar una variable auxiliar en la que almacenar temporalmente el
//valor de una para no "machacarlo"

import java.util.Scanner;

public class U01ejemp10 {
    public static void main(String args[]){
        Scanner sc;
        sc = new Scanner(System.in);

        double a,b,aux;

        System.out.println("Introduce la variable a: ");
        a = sc.nextDouble();
        System.out.println("Introduce la variable b: ");
        b = sc.nextDouble();
        System.out.println("Los valores originales eran a=" + a +" y b=" + b + ".");

        aux = a;
        a = b;
        b = aux;
        System.out.println("Los valores intercambiados son a=" + a +" y b=" + b + ".");
    }
}
