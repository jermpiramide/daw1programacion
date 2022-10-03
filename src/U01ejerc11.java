/*
Escribe un programa que lea dos números enteros y aplique sobre ellos todos los operadores
aritméticos (suma, resta, multiplicación, división entera, módulo, postincremento,
preincremento del primero de ellos, postdecremento y predecremento del segundo),
visualizando todas las operaciones con sus resultados.
 */

import java.util.Scanner;

public class U01ejerc11 {
    public static void main(String args[]){

        Scanner sc;
        int a, b, prea, posta, preb, postb;

        sc = new Scanner(System.in);

        System.out.println("Introduzca dos números enteros separados por un espacio: ");
        a = sc.nextInt();
        b = sc.nextInt();
        prea = ++a;
        posta = a++;
        preb = --b;
        postb = b--;

        System.out.printf("a+b=%d%na-b=%d%na*b=%d%na/b=%d%nResto de a/b=%d%na+1=%d%n1+a=%d%nb-1=%d%n1-b=%d%n", (a+b),
                (a-b), (a*b), (a/b), (a%b),prea, posta, preb, postb);

    }
}
