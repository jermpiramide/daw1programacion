/*
 Realiza un programa que pida los 8 dígitos de un número
 binario a través de una ventana y luego muestre por pantalla
 el binario y su equivalente decimal.
*/

import java.util.Scanner;

public class U03ejemp07 {
    public static void main(String arg[]){

        Scanner sc;
        int[] digito;
        int decimal;

        sc = new Scanner(System.in);
        digito = new int[8];

        decimal = 0;

        for (int i = 0; i < digito.length; i++) {

            System.out.println("Introduzca la posición " + i + " del número binario: ");
            digito[i] = sc.nextInt();
            decimal += digito[i] * Math.pow(2, (8-1)-i); //El mayor exponente es igual al número de dígitos
            // menos uno: 2⁷. Por eso ponemos (8-1) en el argumento de Math.pow().
        }

        muestraArray(digito);
        System.out.println("Decimal: " + decimal);
    }

    public static void muestraArray(int[] array){

        System.out.printf("Binario: ");

        for(int i=0; i<array.length; i++){

            System.out.printf("%d", array[i]);
        }

        System.out.println();
    }
}
