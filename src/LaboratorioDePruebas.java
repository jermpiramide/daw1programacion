// Esta es una clase para poder hacer pruebas. Como si se tratara de una hoja en sucio.


import java.util.Scanner;

public class LaboratorioDePruebas {

    public static void main(String args[]){

        Scanner sc;
        int[] numero, minmax;

        sc = new Scanner(System.in);
        numero = new int[10];
        minmax = new int[2];

        for(int i=0; i<10; i++){
            System.out.println("Introduzca un número: ");
            numero[i] = sc.nextInt();
        }

        buscaMinMax(numero, minmax);

        muestraArray(numero);
        System.out.println();

        System.out.printf("Mínimo: %d \nMáximo: %d", minmax[0], minmax[1]);
    }

    public static void buscaMinMax(int[] numero, int[] minmax){

        minmax[0] = numero[0];
        minmax[1] = numero[0];

        for(int num :numero){
            minmax[0] = Math.min(minmax[0], num);
            minmax[1] = Math.max(minmax[1], num);
        }
    }

    public static void muestraArray(int[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%d ", array[i]);
        }
    }
}


