//Examen 11/2022

import java.util.Scanner;

public class JERM01 {

    public static void main(String args[]){

        Scanner sc;
        int[] numero = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};      //Array para recoger la muestra de números.
        boolean correcto;       //Variable para determinar si la muestra de datos es correcta.

        sc = new Scanner(System.in);

        //El siguiente bucle se ejecutará como mínimo una vez para solicitar y recoger los datos. En caso de que los
        //datos introducidos no sean correctos, el bucle se volverá a ejecutar para solicitar de nuevo los datos y se
        //ejecutará tantas veces como sea necesario hasta que los datos recogidos sean correctos.
        do {
            System.out.println("Introduzca diez números enteros diferentes comprendidos entre 10 y 100 separados" +
                    " por espacios: ");

            //Bucle para recoger los datos introducidos por teclado.
            for (int i = 0; i < 10; i++) {
                numero[i] = sc.nextInt();
            }

            correcto = esCorrecto(numero);      //Función que comprueba que la muestra es correcta.
        } while (correcto == false);

        System.out.println("La muestra de datos es correcta y los datos introducidos son los siguientes:");

        muestraArray(numero);
    }

    public static boolean esCorrecto(int[] lista){

        //Bucle para recorrer todos los elementos de lista y comprobar si cumple las condiciones requeridas.
        for(int i=0; i<10; i++){
            //Comprobamos si lista[i] se encuentra en el rango exigido.
            if (lista[i]<10 || lista[i]>100){
                System.out.println("La muestra de datos es incorrecta. Por lo menos ha introducido un número fuera" +
                        " de rango.");
                return false;
            }
            //Comprobamos si hay algún término repetido en la lista.
            for(int j=(i+1); j<10; j++)
                if (lista[i] == lista[j]){
                    System.out.println("La muestra de datos es incorrecta. Ha introducido al menos dos números iguales.");
                    return false;
                }
        }

        return true;
    }

    public static void muestraArray(int[] array) {
        //Esta función muestra por pantalla el array.

        for (int i = 0; i < (array.length); i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
}
