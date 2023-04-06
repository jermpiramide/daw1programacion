/*
Define un array de 10 caracteres y asigna los valores a los elementos según la tabla que se muestra
a continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores
de los elementos que no han sido inicializados?. Indica la respuesta en forma de comentario.
*/

public class U03ejerc04 {
    public static void main(String args[]){

        char[] array;

        array = new char[10];

        array[0] = 'a';
        array[1] = 'x';
        array[4] = '@';
        array[6] = ' ';
        array[7] = '+';
        array[8] = 'Q';

        muestraArray(array);
        //Los valores del array se inicializan de forma automática con un símbolo.
    }

    public static void muestraArray(char[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%c ", array[i]);
        }
    }

}
