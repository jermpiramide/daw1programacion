// Crea un array de notas de un alumno. Además crea una variable que almacene el número de años
// que lleva estudiando en el centro. Genera un método que "cambie" el valor de los años que
// lleva estudiando en el centro (pasado como argumento). Luego otro que cambie la primera nota del array
// (pasado como argumento).
// Invoca los dos métodos, presenta luego los datos y observa lo que pasa. (utiliza .length)
//***Prueba de cambio Git.

public class U03ejemp02 {
    public static void main(String args[]){

        double[] nota = {3, 6, 7, 8, 10, 2, 4, 0, 9};
        int anos = 10, posicion = 0, nuevanota = 8;

        System.out.println("Años: " + anos);

        duplicaEntero(anos);

        System.out.println("La variable \"anos\" después de aplicar el método \"duplicaEntero\" vale: " + anos);

        muestraArray(nota);

        System.out.println();

        modificaArray(nota, posicion, nuevanota);

        muestraArray(nota);
    }

    public static void duplicaEntero(int anos){

        anos *= 2;
        System.out.println("Años duplicados: " + anos);
    }

    public static void muestraArray(double[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%.1f ", array[i]);
        }
    }

    public static void modificaArray(double[] array, int posicion, int cambio){

        array[posicion] = cambio;
    }
}
