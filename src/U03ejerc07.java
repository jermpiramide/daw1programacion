//Escribe un programa que lea 15 números por teclado y los almacene en un array. Rota los elementos
// de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a
// la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente,
// muestra el contenido del array.

import java.util.Scanner;

public class U03ejerc07 {
    public static void main(String args[]){

        double[] numero;

        numero = new double[15];

        pideAlmacenaNumeros(numero);
        muestraArray(numero);
        arrayDesplaza1(numero);
        muestraArray(numero);
    }

    public static void pideAlmacenaNumeros(double[] numero){

        Scanner sc;

        sc = new Scanner(System.in);

        for(int i=0; i<numero.length; i++){
            System.out.println("Introduzca un número: ");
            numero[i] = sc.nextDouble();
        }
    }

    public static void muestraArray(double[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%.1f ", array[i]);
        }

        System.out.println();
    }

    public static void arrayDesplaza1(double[] array){

        double aux;

        aux = array[array.length-1]; //Almacenamos el último elemento del array porque lo vamos a machacar
        // en el primer paso del bucle y lo vamos a necesitar al final de este método para modificar el
        // primer elemento del array.
        // El índice del útimo elemento de un array siempre es igual a la longitud del array menos una unidad
        // (porque el índice de la primer posición de un array es 0.

        for(int i=(array.length-1); i>=1; i--){
            //Al empezar por el final del array nos ahorramos tener que utiliza variables
            // auxiliares donde almacenar datos.
            //El bucle empieza en array.length-1 porque el índice de la última posición de un array siempre
            // es igual a la longitud del array menos una unidad.
            //El bucle finaliza en i=1 porque array[0] no se puede modificar dentro del bucle.
            array[i] = array[i-1];
        }

        array[0] = aux;
    }
}
