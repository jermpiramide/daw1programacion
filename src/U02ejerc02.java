//Escribe un programa que lea del teclado tres números e indique el mayor de ellos.

import java.util.Scanner;

public class U02ejerc02 {
    public static void main(String args[]){

        Scanner sc;
        double numeroA, numeroB, numeroC, numeromayor;

        sc = new Scanner(System.in);

        System.out.println("Introduzca por teclado tres números separados por espacio: ");
        numeroA = sc.nextDouble();
        numeroB = sc.nextDouble();
        numeroC = sc.nextDouble();

        /*
        if (numeroA>numeroB){
            numeromayor = numeroA;
        } else {
            numeromayor = numeroB;
        }
        if (numeroC>numeromayor){
            numeromayor = numeroC;
        }
        */
        numeromayor = Math.max(numeroA, numeroB);
        numeromayor = Math.max(numeromayor, numeroC);

        System.out.printf("El número mayor es: %f", numeromayor);
    }
}
