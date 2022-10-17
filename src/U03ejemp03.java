// Haz un ejercicio que pida al usuario que cantidad de datos enteros
// quiere almacenar y posteriormente, se los pida y los almacene en un array.
// Finalmente, haz que presente los datos utilizando un bucle de tipo for-each.

import java.util.Scanner;

public class U03ejemp03 {
    public static void main(String args[]){

        int[] numeros;

        numeros = creaArray(); //Generamos un array y se lo asignamos a la variable "numeros".
        llenaArray(numeros); //Llenamos el array con números.
        muestraArray(numeros);
    }

    public static int[] creaArray(){
        //Este método devuelve un array de enteros y no recibe ningún dato.

        Scanner sc;
        int tamano;
        int[] array;

        sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array: ");
        tamano = sc.nextInt();

        array = new int[tamano];

        return array;
    }

    public static void llenaArray(int[] array){
        //Este método recibe un array de enteros y lo modifica.
        //No necesitamos devolver el nuevo array porque la función ha recibido el array a modificar como
        // dato y al no ser un dato primitivo, el dato se pasa por referencia.

        Scanner sc;

        sc = new Scanner(System.in);

        for(int i=0; i<array.length; i++){
            System.out.println("Introduce el valor que quieras asignar a la posición " + i + " del array.");
            array[i] = sc.nextInt();
        }
    }

    public static void muestraArray(int[] array){

        for(int i :array){
            //A este tipo de bucle se le denomina "for-each".
            //It starts with the keyword for like a normal for-loop.
            //Instead of declaring and initializing a loop counter variable, you declare a variable that is the
            // same type as the base type of the array, followed by a colon, which is then followed by the array name.
            //In the loop body, you can use the loop variable you created rather than using an indexed array element.

            System.out.print("\t" + i);
        }
    }
}


