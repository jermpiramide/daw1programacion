/*
 Un programador trabaja en dos proyectos simultáneamente. Crea un vector bidimensional
 que represente las horas trabajadas en cada proyecto cada día de la semana y llénalo con valores.
 Haz que compruebe que ningún día se ha trabajado más de 8 horas.
*/


public class U03ejemp05 {
    public static void main(String args[]){

        int[][] horas = {{2, 3, 4, 2, 7},{4, 5, 2, 9, 2,}}; //Cada fila del array recoge las horas dedicadas
        // a un proyecto concreto a lo largo de los cinco días laborables de la semana.

        System.out.println("Tamaño del array: " + horas.length + "x" + horas[0].length); //El primer término nos
        // da el número de filas del array, mientras que el segundo término nos da el número de columnas de la
        // primera fila. Suponemos que todas las filas tienen la misma longitud (matriz rectangular).
        System.out.println();

        muestraArray(horas);

        if(horasExtra(horas)){
            System.out.println("Hay alguna jornada de más de ocho horas.");
        }else{
            System.out.println("No hay ninguna jornada de más de ocho horas.");
        }
    }

    public static void muestraArray(int[][] array){
        for(int i=0; i<array.length; i++){

            System.out.println("Horas trabajadas en el proyecto " + i + " de lunes a viernes: ");

            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static boolean horasExtra(int[][] array){

        for(int[] i :array){
            for(int j :i){
                if(j>8){
                    return true;
                }
            }
        }

        return false;
    }
}
