// Haz un ejercicio que pida al usuario que cantidad de datos enteros
// quiere almacenar y posteriormente, se los pida y los almacene en un array.
// Finalmente, haz que presente los datos utilizando un bucle de tipo for-each.

import java.util.Scanner;

public class U03ejemp03 {
    public static void main(String args[]){

        int[] numeros;

        numeros = creaArray(); // Generamos un array utilizando una función y se lo asignamos a la variable "numeros".
                               // Aunque no hemos instanciado el array, esto no es un problema ya que la función va a
                               // devolver la dirección del array que allí se haya creado.
        /*
        // Otra forma de crear un array del tamaño deseado es instanciarlo en la función main en lugar de instanciarlo
        // dentro de la función creaArray y que esta devuelva la dirección del array a la variable numeros del main.
        Scanner sc;
        int cantidad;
        int[] datos;

        sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de datos que quieres almacenar: ");
        cantidad = sc.nextInt();

        datos = new int[cantidad];

         */
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
        // Este método recibe un array de enteros y lo modifica.
        // No necesitamos devolver el nuevo array porque la función ha recibido el array a modificar como
        // dato y al no ser un dato primitivo, el dato se pasa por referencia.

        Scanner sc;

        sc = new Scanner(System.in);

        for(int i=0; i<array.length; i++){
            System.out.println("Introduce el valor que quieras asignar a la posición " + i + " del array.");
            array[i] = sc.nextInt();
        }

        /*
        // Otra forma de solicitar datos y almacenarlos en el array es solicitar todos los datos de una sola vez.

        System.out.printf("Introduce %d números enteros separados por un espacio: \n", elementos.length);

        for(int i=0; i<elementos.length; i++){
            elementos[i] = sc.nextInt();
        }
         */
    }

    public static void muestraArray(int[] array){

        for(int i :array){
            // A este tipo de bucle se le denomina "for-each".
            // It starts with the keyword for like a normal for-loop.
            // Instead of declaring and initializing a loop counter variable, you declare a variable that is the
            // same type as the base type of the array, followed by a colon, which is then followed by the array name.
            // In the loop body, you can use the loop variable you created rather than using an indexed array element.

            System.out.print("\t" + i);
        }
    }
}


