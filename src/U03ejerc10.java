// Escribe un programa que lea un número binario de 8 dígitos y muestre su valor en decimal.

import java.util.Scanner;

public class U03ejerc10 {
    public static void main(String args[]){

        Scanner sc;
        int[] numerobinario;
        String palabrabinaria;
        int numerodecimal;

        sc = new Scanner(System.in);
        numerobinario = new int[8];
        palabrabinaria = new String("palabra");

        System.out.println("Introduzca un número binario de 8 dígitos: ");
        palabrabinaria = sc.nextLine();

        if(palabrabinaria.length() != 8){
            System.out.println("El número introducido no tiene 8 dígitos.");

        }else{
            char aux;

            for(int i=0; i<8; i++){

                aux = palabrabinaria.charAt(i);
                System.out.println("Llega aquí." + aux);
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
