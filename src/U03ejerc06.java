//Escribe un programa que pida 10 números por teclado y que luego muestre los números
// introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo
// respectivamente.

import java.util.Arrays;
import java.util.Scanner;

public class U03ejerc06 {
    public static void main(String args[]){

        Scanner sc;
        double[] numero, minmax;

        sc = new Scanner(System.in);
        numero = new double[10];
        minmax = new double[2];

        for(int i=0; i<10; i++){
            System.out.println("Introduzca un número: ");
            numero[i] = sc.nextDouble();
        }

        buscaMinMax(numero, minmax);

        muestraArray(numero);
        System.out.println();

        System.out.printf("Mínimo: %.1f\nMáximo: %.1f", minmax[0], minmax[1]);
    }

    public static void buscaMinMax(double[] numero, double[] minmax){

        minmax[0] = numero[0];
        minmax[1] = numero[0];

        for(double num :numero){
            minmax[0] = Math.min(minmax[0], num);
            minmax[1] = Math.max(minmax[1], num);
        }
    }

    public static void muestraArray(double[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%.1f ", array[i]);
        }
    }
}
