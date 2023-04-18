/*
Realiza un método que devuelva cierto si la matriz de dimensiones NxN que se le pasa como argumento es simétrica.
Una matriz A es simétrica si a(i,j) = a(j,i). Ejemplos de matrices simétricas en las imágenes
*/


public class U03ejerc14 {
    public static void main(String Args[]){

        double[][] matriz_Ejemplo = {{1,2,3},{0,4,5},{3,5,6}};
        boolean es_Simetrica = false;

        es_Simetrica = comprueba_Simetria(matriz_Ejemplo);

        System.out.println("Simetría de la matriz: " + es_Simetrica);

    }

    public static boolean comprueba_Simetria(double[][] matriz){

        boolean simetrica;

        simetrica = true;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j]!=matriz[j][i]){
                    simetrica = false;
                }
            }
        }

        return simetrica;
    }
}
