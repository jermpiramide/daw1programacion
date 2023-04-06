/*
Define tres arrays de 20 números enteros cada uno, con nombres: numero, cuadrado y cubo. Carga el
array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los
cuadrados de los valores que hay en el array numero. En el array cubo se deben almacenar los cubos
de los valores que hay en numero. A continuación se muestra el contenido de los tres arrays dispuestos
en tres columnas.
*/

public class U03ejerc05 {
    public static void main(String args[]){

        int[] numero, cuadrado, cubo;

        numero = new int[20];
        cuadrado = new int[20];
        cubo = new int[20];

        for(int i=0; i<20; i++){
            numero[i] = (int) (Math.random()*100);
            cuadrado[i] = (int) (Math.pow(numero[i], 2));
            cubo[i] = (int) (Math.pow(numero[i], 3));
        }

        for(int i=0; i<20; i++){
            System.out.printf("%d %d %d\n", numero[i], cuadrado[i], cubo[i]);
        }

    }
}
