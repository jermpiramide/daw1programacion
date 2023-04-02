// Crea un array de notas de un alumno. Además crea una variable que almacene el número de años
// que lleva estudiando en el centro. Genera un método que "cambie" el valor de los años que
// lleva estudiando en el centro (pasado como argumento). Luego otro que cambie la primera nota del array
// (pasado como argumento).
// Invoca los dos métodos, presenta luego los datos y observa lo que pasa. (utiliza .length)

public class U03ejemp02 {
    public static void main(String args[]){

        double[] nota = {3, 6, 7, 8, 10, 2, 4, 0, 9};
        int anos = 10, posicion = 0, nuevanota = 8;

        System.out.println("Años: " + anos);

        duplicaEntero(anos); // El argumento es un int. Al ser un tipo de dato primitivo su paso es por valor. Por
                             // tanto, la variable anos no va a verse modificada en el main.
                             // Para modificar el valor de anos el procedimiento tendría que devolver un entero con el
                             // dato modificado y asignárselo a la variable anos.

        System.out.println("La variable \"anos\" después de aplicar el método \"duplicaEntero\" vale: " + anos);

        muestraArray(nota); // El argumento es un array. Puesto que los arrays son objetos, su paso es por referencia.

        System.out.println();

        modificaArray(nota, posicion, nuevanota); // El primer argumento es un array. Puesto que los arrays son
                                                  // objetos, su paso es por referencia. Esto implica que el array se
                                                  // verá modificado en el main si se modifica dentro del método.

        muestraArray(nota);
    }

    public static void duplicaEntero(int anos){

        anos *= 2;
        System.out.println("Años duplicados: " + anos);
    }

    public static void muestraArray(double[] array){

        for(int i=0; i<array.length; i++){
            // array.length nos devuelve un entero con la longitud del array.

            System.out.printf("%.1f ", array[i]);
        }
    }

    public static void modificaArray(double[] array, int posicion, int cambio){
        // Puesto que un array es un objeto, su paso se hace por referencia. Esto significa que, si modificamos los
        // elementos de un array dentro de un método al que le ha sido pasado el array como dato, los datos del
        // array son modificados dentro y fuera del procedimiento.

        array[posicion] = cambio;
    }
}
