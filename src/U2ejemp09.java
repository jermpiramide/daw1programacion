// Muestra la tabla de multiplicar de un número n
// introducido por el teclado (utilizadno do while)

import java.util.Scanner;

public class U2ejemp09 {
    public static void main(String args[]){

        Scanner sc;
        int numero;

        sc = new Scanner(System.in);

        System.out.println("Itroduzca un número: ");
        numero = sc.nextInt();

        for(int i=0; i<=9; i++){
            System.out.println(numero + "x" + i + "=" + (numero*i));
        }
    }
}
