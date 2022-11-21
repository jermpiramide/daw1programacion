// Muestra la tabla de multiplicar de un número n
// introducido por el teclado (utilizadno do while)

import java.util.Scanner;

public class U02ejemp09 {
    public static void main(String args[]){

        Scanner sc;
        int numero;
        int j;

        sc = new Scanner(System.in);
        j = 0;

        System.out.println("Itroduzca un número: ");
        numero = sc.nextInt();

        /*
        for(int i=0; i<=9; i++){
            System.out.println(numero + "x" + i + "=" + (numero*i));
        }
        */

        do {
            System.out.println(numero + "x" + j + "=" + (numero * j));
            j++;
        } while(j<=9);
    }
}
