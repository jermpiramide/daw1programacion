/*
 Crea un programa que nos haga una tabla en la que se reflejen las
 temperaturas de cada hora del día de toda la semana.
 Rellénalas con valores aleatorios razonables. Muestra los datos por pantalla.
*/

public class U03ejemp06 {
    public static void main(String args[]){

        double[][] temperatura;

        temperatura = new double[7][24];

        rellenaArray2DTemperaturas(temperatura);
        muestraArray2D(temperatura);
    }

    public static void rellenaArray2DTemperaturas(double[][] array){

        double tempmax, tempmin;
        tempmax = 50;
        tempmin = -50;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                //array[i][j] = (Math.random()*100)-50;
                array[i][j] = (Math.random()*(tempmax-tempmin)+tempmin); //(tempmax-tempmin) nos da la distancia entre
                // la temperatura máxima y la mínima. Cuando le añadimos +tempmin situa este intervalo entre los
                // limites tempmin y tempmax.
            }
        }

/*        for(double[] i :array){
            // Con este bucle foreach rellenamos el array de dos dimensiones. NO FUNCIONA!!!!!!
            for(double j :i){
                j = (Math.random()*(tempmax-tempmin)+tempmin); //(tempmax-tempmin) nos da la distancia entre

            }
        }*/
    }

    public static void muestraArray2D(double[][] array){

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.printf("Temperatura [%d][%d]: %.1fº\n", (i+1), j, array[i][j]);
            }
        }

        /*for(double[] fila :array){
            for(double valor :fila)
                System.out.printf("%.2f \n", valor);
        }*/

        System.out.println();
    }
}
