/*
Ejercicio 9: Escribe un programa que solicite al usuario un número N y luego muestre
 por pantalla la siguiente ejecución:
1
1 2
1 2 3
……
1 2 3 ….N
…
1 2 3
1 2
1
*/

import java.util.Scanner;

public class U02ejerc09 {
    public static void main(String args[]){

        Scanner sc;
        int numero;

        sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        numero = sc.nextInt();

        for(int i=0; i<numero; i++){
            for(int j=0; j<=i; j++){
                System.out.printf("%d ", (j+1));
            }
            System.out.println();
        }
        for(int i=(numero-1); i>0; i--){
            for(int j=0; j<=(i-1); j++){
                // Condicionamos el bucle para que en la primera línea no escriba todos los números poniendo j<=(i-1)
                // en lugar de j<=i.
                System.out.printf("%d ", (j+1));
            }
            System.out.println();
        }
    }
}
