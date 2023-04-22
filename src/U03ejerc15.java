/*
Realiza un método que reciba una matriz de dimensiones NxN y almacene sobre ella su traspuesta. La matriz traspuesta
es aquella que se obtiene cambiando ordenadamente las filas por las columnas. En la imagen aparece como ejemplo una
matriz y su traspuesta.
*/

public class U03ejerc15{

    public static void main(String Args[]){

        double[][] matriz_Ejemplo = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

        muestra_Matriz(matriz_Ejemplo);
        System.out.println("________");
        transpone_Matriz(matriz_Ejemplo);
        muestra_Matriz(matriz_Ejemplo);
    }

    public static void transpone_Matriz(double[][] matriz){

        double aux;

        for(int i=0; i<matriz.length; i++){
            for(int j=i+1; j<matriz[i].length; j++){
            // Realizamos trasposición tomando como referencia únicamente los elementos a la derecha de la diagonal.
            // Si tomáramos como referencia todos los elementos de la matriz, la trasposición se realizaría dos veces
            // dando como resultado la matriz original.
            // Dentro del bucle que recorre las filas empezamos en j=i+1 para que el primer elemento de referencia de
            // cada fila sea el primer elemento a la derecha de la diagonal.
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

    }

    public static void muestra_Matriz(double[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("%.0f\t", matriz[i][j]);
            }
            System.out.println();
        }
        return;
    }
}
