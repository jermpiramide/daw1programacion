// Modifica el programa anterior teniendo en cuenta que el número de dígitos binarios del
// número pueda ser cualquiera.

import java.util.Scanner;

public class U03ejerc11 {

    public static void main(String args[]){

        Scanner sc;
        int[] numerobinario;
        String palabrabinaria;
        int numerodecimal;
        char aux;

        sc = new Scanner(System.in);
        numerobinario = new int[];
        String palabra;
        palabra ="palabra";
        String palabra2= "palabra";

        String palabra3 = new String( "palabra");
        System.out.println(palabra == palabra2);
        palabrabinaria = new String("palabra");

        System.out.printf("Introduzca un número binario.");
        palabrabinaria = sc.nextLine();

        stringABinario(palabrabinaria)

        for(int i=0; i<palabrabinaria.length(); i++){

            aux = palabrabinaria.charAt(i);

            if(aux == '0'){
                numerobinario[i] = 0;
            }else if(aux == '1'){
                numerobinario[i] = 1;
            }else{
                System.out.println("El número introducido contiene dígitos no binarios.");
                break;
            }
        }

        muestraArray(numerobinario);
        numerodecimal = binarioADecimal(numerobinario);
        System.out.println("Decimal: " + numerodecimal);
    }

    public static void muestraArray(int[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%d ", array[i]);
        }

        System.out.println();
    }

    public static int binarioADecimal(int[] binario){

        int decimal;

        decimal = 0;

        for(int i=(binario.length-1); i>=0; i--){
            decimal += binario[i]*Math.pow(2, (binario.length-1)-i);
        }

        return decimal;
    }
}
