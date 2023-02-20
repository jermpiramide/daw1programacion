// Esta es una clase para poder hacer pruebas. Como si se tratara de una hoja en sucio.

/*
 Crea un programa que nos haga una tabla en la que se reflejen las
 temperaturas de cada hora del día de toda la semana.
 Rellénalas con valores aleatorios razonables. Muestra los datos por pantalla.
*/


public class LaboratorioDePruebas {

   public static void main(String args[]){

       double[][] temperaturas;
       double tempmax = 50, tempmin = -50;

       temperaturas = new double[7][24];

       for(double[] dia :temperaturas){
           for(double hora :dia){
               hora = ((Math.random()*(tempmax-tempmin))+tempmin);
               System.out.println(dia + "     " + hora + "     ");
           }
       }

       muestraArray2D(temperaturas);

   }

    public static void muestraArray2D(double[][] array){

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.printf("Temperatura [%d][%d]: %.1fº\n", i, j, array[i][j]);
            }
        }

        /*for(double[] fila :array){
            for(double valor :fila)
                System.out.printf("%.2f \n", valor);
        }*/

        System.out.println();
    }
}


