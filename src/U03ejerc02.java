//Define un array de 12 números y asigna valores a los elementos según la tabla que se muestra a
// continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores
// de los elementos que no han sido inicializados?. Indica la respuesta en forma de comentario.

public class U03ejerc02 {
    public static void main(String args[]){

        int[] array;

        array = new int[12];

        array[0] = 39;
        array[1] = -2;
        array[4] = 0;
        array[6] = 14;
        array[8] = 5;
        array[9] = 120;

        muestraArray(array);
        //Los valores del array se inicializan a 0 de forma automática.
    }

    public static void muestraArray(int[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%d, ", array[i]);
        }
    }
}
