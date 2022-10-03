//Escribe un programa que sume, reste, multiplique y divida dos números enteros introducidos por teclado.
// Pista: Aquí hay que utilizar la clase Scanner. Lo veremos en clase

import java.util.Scanner;

public class U01ejemp08 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.println("Por favor introduzca el primer número entero:");
        a = sc.nextInt();
        System.out.println("Por favor, introduzca el segundo número entero:");
        b = sc.nextInt();

        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a*b));
        System.out.println("a/b=" + (a/b));
        System.out.println("a%b=" + (a%b));
    }
}
