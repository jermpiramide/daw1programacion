//Crea un programa que permita almacenar en un array un conjunto de 20 números enteros de
// valores comprendidos entre 0 y 99 generados aleatoriamente (utiliza el método Math.random()).

public class U03ejerc03 {
    public static void main(String args[]){

        int[] array;

        array = new int[20];

        for(int i=0; i<array.length; i++){

            array[i] = (int) (Math.random()*100);
        }
        muestraArray(array);
    }
    public static void muestraArray(int[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%d ", array[i]);
        }
    }
}
