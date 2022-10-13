// Realiza un programa que calcule la media de n números introducidos por teclado.
// El valor de n se pedirá al usuario al comienzo del programa
// y será un valor entero positivo mayor que 0. (acumulador y contador)

import java.util.Scanner;

public class U02ejemp10 {
    public static void main(String args[]){

        Scanner sc;
        int cantidad;
        double media;

        media = 0; //Inicializamos la cantidad a cero. Vamos a usar esta variable como un acumulador.

        sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de números con los que deseas calcular la media: ");
        cantidad = sc.nextInt();

        System.out.println("Introduce, separado por espacios; los números de los que quieras calcular su media: ");

        for(int i=0; i<cantidad; i++){
            media = media + sc.nextInt();
        }

        media = media/cantidad;

        System.out.printf("La media es %.2f%n", media);
    }
}
