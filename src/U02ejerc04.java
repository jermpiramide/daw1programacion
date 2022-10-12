//Escribe un programa que indique si un número entero leído por teclado se puede expresar como el cuadrado de un número
// entero. Por ejemplo, el número 9 se puede expresar como el cuadrado de 3, mientras que el 8 no. (Pista, no hace
// falta utilizar repetición, utilizar librería matemática).

import java.util.Scanner;

public class U02ejerc04 {
    public static void main(String args[]){

        Scanner sc;
        double numero, raiz;

        sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        numero = sc.nextInt();

        raiz = Math.sqrt(numero);

        if ((raiz-Math.floor(raiz)) == 0){
            System.out.printf("El número %.0f se puede expresar como el cuadrado de %.0f.", numero, raiz);
        } else {
            System.out.printf("El número %.0f no se puede expresar como el cuadrado de un número entero.", numero);
        }
    }
}
