/*
 Crea un array en el que se almacenen los datos de porcentaje
 de llenado de un pantano en cada uno de los meses del año.
 A partir de ese array, muestra por pantalla los correspondientes a los meses de verano.
 (Crea el array como objeto y también explícitamente)
*/


public class U03ejemp01 {
    public static void main(String args[]) {

        /*
        double[] lleno;

        lleno = new double[12];

        for(int i=0; i<12; i++){
            // Llenamos el array con unos valores cualesquiera, siempre menores que 100.
            lleno[i] = i*8;
        }

        for(int i=0; i<12; i++){
            System.out.printf("%.1f ", lleno[i]);
        }

         */

        double[] lleno = {78, 76, 45, 76, 56, 34, 54, 54, 23, 54, 23, 12};

        for(int i=6; i<10; i++){
            System.out.printf("%.1f ", lleno[i]);
        }
        System.out.println(lleno);
    }
}
