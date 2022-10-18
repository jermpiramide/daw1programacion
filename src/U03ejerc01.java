//Escribe un programa que lea 10 números por teclado y luego los muestre en orden inverso, es decir, el primero que
// se introduce es el último en mostrarse y viceversa.

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

        muestraArray(lista);
        invierteArray(lista);
        muestraArray(lista);
    }

    public static void muestraArray(double[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%.1f ", array[i]);
        }
    }

    public static void invierteArray(double[] array){
        double aux;
        int size = array.length;
        System.out.println("Tamaño del array: " + size);

        for(int i=0; i<array.length; i++){
            aux = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = aux;
        }
    }
}
