// Esta es una clase para poder hacer pruebas. Como si se tratara de una hoja en sucio.

// Realiza un programa que calcule la media de n números introducidos por teclado.
// El valor de n se pedirá al usuario al comienzo del programa
// y será un valor entero positivo mayor que 0. (acumulador y contador)

import java.util.Scanner;

public class LaboratorioDePruebas {

    public static void main(String args[]){

        Scanner sc;
        int tamano, aux;
        double media;

        sc = new Scanner(System.in);
        media = 0;

        System.out.println("Introduce la cantidad de numeros: ");

        tamano = sc.nextInt();

        System.out.println("Introduce los " + tamano + " datos separados por un espacio: ");

        for(int i=0;i<tamano;i++){
            media = media + sc.nextInt();
        }

        System.out.println("La media es " + media/tamano);
    }

}


