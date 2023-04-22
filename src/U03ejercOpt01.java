/*
Una matriz de dimensiones NxN de enteros es mágica si:
Aparecen todos los números enteros desde 1 a N² (siendo N la dimensión de la matriz.
La suma de los elementos de cada fila, cada columna, y las dos diagonales dan el mismo valor.
Por ejemplo, la matriz siguiente de dimensiones 5x5 contiene todos los elementos del 1 al 25 y tiene como suma común 65.

Desarrolla un programa que lea una matriz y nos indique si es mágica. Nota: Puedes probar el programa con las
siguientes matrices que son también mágicas:
 */
public class U03ejercOpt01 {

    public static void main(String Args[]){
        int[][] matriz01 = {{4,9,2},{3,5,7},{9,1,6}}, matriz02 = {{16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1}};

        es_Magica(matriz01);
        es_Magica(matriz02);
    }

    public static void es_Magica(int[][] matriz){

        int referencia; // En esta variable almacenaremos el valor de referencia para compararlo con las diferentes
        // sumas de fila, columna y diagonal.

        referencia = suma_Fila(matriz,0); // Calculamos la suma de la primera fila como referencia.

        System.out.println("Valor de la suma de la diagonal, de las filas y de las columnas " + referencia);

        for(int i=1; i<matriz.length; i++){
        // Calculamos la suma de cada fila y la comparamos con la referencia.
        // El valor inicial del índice empieza en 1 porque la suma de la fila 0 ya la hemos calculado y la utilizamos
        // como referencia.
            if(suma_Fila(matriz, i)!=referencia){
                System.out.println("La matriz no es mágica.");
                return;
            }
        }

        for(int i=0; i<matriz[0].length; i++){
        // Calculamos la suma de cada columna y la comparamos con la referencia.
            if(suma_Columna(matriz, i)!=referencia){
                System.out.println("La matriz no es mágica.");
                return;
            }
        }

        if(suma_Diagonal(matriz)!=referencia){
        // Calculamos la suma de la diagonal y la comparamos con la referencia.
            System.out.println("La matriz no es mágica.");
            return;
        }

        if(numeros_Magicos(matriz)==false){
            System.out.println("La matriz no es mágica.");
            return;
        }

        System.out.println("La matriz es mágica.");

        return;
    }

    public static int suma_Fila(int[][] matriz, int fila){

        int suma;

        suma = 0;

        for(int i=0; i<matriz[fila].length; i++){
            suma += matriz[fila][i];
        }

        return suma;
    }

    public static int suma_Columna(int[][] matriz, int columna){

        int suma;

        suma = 0;

        for(int i=0; i<matriz[0].length; i++){
            suma += matriz[i][columna];
        }

        return suma;
    }

    public static int suma_Diagonal(int[][] matriz){

        int suma;

        suma = 0;

        for(int i=0; i<matriz.length; i++){
            suma += matriz[i][i];
        }

        return suma;
    }

    public static Boolean numeros_Magicos(int[][] matriz){
        // Esta función determina si en la matriz aparecen todos los números entre 1 y NxN.

        int dimension_Cuadrada; // Esta variable almacena el valor de la dimensión al cuadrado NxN.

        dimension_Cuadrada = Math.pow(matriz.length, 2);

        for(int i=1; i<=dimension_Cuadrada; i++){
            for(int j=0; j<matriz.length; j++){
                for(int k; k<matriz[j].length; k++){
                    if(i==matriz[j][k]){
                        k=matriz[j].length; // Asignamos a k un valor fuera de sus límites para que finalice el bucle.
                        j=matriz.length; // Asignamos a j un valor fuera de sus límite para que finalice el bucle.
                    }
                }
            }
        }


    }

}


