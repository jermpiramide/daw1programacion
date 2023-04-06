/*
Escribe un programa que lea 10 números por teclado y luego los muestre en orden inverso, es decir, el primero que
 se introduce es el último en mostrarse y viceversa.
*/

import java.util.Scanner;

public class U03ejerc01 {
    public static void main(String args[]){

        Scanner sc;
        int tamano;
        double[] lista;

        sc = new Scanner(System.in);

        System.out.println("Introduzca el tamaño que ha de tener el array: ");
        tamano = sc.nextInt();
        lista = new double[tamano];


        for(int i=0; i<tamano; i++){
            System.out.printf("Introduce un número para la posición %d del array: ", i);
            lista[i] = sc.nextDouble();
        }
        System.out.println();

        muestraArray(lista);
        invierteArray(lista);
        muestraArray(lista);
    }

    public static void muestraArray(double[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%.1f ", array[i]);
        }

        System.out.println();
    }

    public static void invierteArray(double[] array){
        double aux;
        int size = array.length;
        System.out.println("Tamaño del array: " + size);
        // System.out.println("size/2: " + (size/2)); // Recordemos que el operador / nos devuelve la parte entera.

        for(int i=0; i<size/2; i++){
        // Al estar permutando elementos del array en cada paso se modifican dos posiciones, por lo que no es necesario
        // hacer tantas iteraciones como posiciones tiene el array.
        // En el caso de que el tamaño del array sea par, este bucle realiza un número de iteraciones igual a la mitad
        // de su tamaño.
        // En el caso de que el tamaño del array sea impar, este bucle realiza un número de iteraciones igual a la mitad
        // de su tamaño menos uno. Podríamos pensar que esto es un problema porque nos dejamos una posición sin
        // permutar, pero esto no es un problema porque esa posición vería modificado su valor consigo misma y , por
        // por tant, no vería modificado su valor.
            aux = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = aux;
            //Este bucle se puede optimizar para ahorrar un paso en el caso de que la longitud del array sea impar.
        }
    }
}
