//Escribe un programa que lea un número entero N mayor que 0 y calcule la suma 1+2+3+4+5+6+...+N

import java.util.Scanner;

public class U2ejerc07 {
    public static void main(String args[]){

        Scanner sc;
        int numero, suma;

        sc = new Scanner(System.in);
        suma = 0;

        System.out.println("Inserte un número: ");
        numero = sc.nextInt();

        while(numero>0){
            //suma = suma+numero;
            //numero--;
            suma += numero--;
        }

        System.out.printf("Suma = %d", suma);
    }
}
