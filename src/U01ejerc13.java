/*
Escribe un programa que lea una cantidad entera en euros y realice el desglose en billetes
priorizando los más grandes. Ejemplo de ejecución:
Introduce la cantidad: 3456
Billetes de 500 euros: 6
Billetes de 200 euros: 2
Billetes de 100 euros: 0
Billetes de 50 euros: 1
Billetes de 20 euros: 0
Billetes de 10 euros: 0
Billetes de 5 euros: 1
Euros en monedas: 1
 */

import java.util.Scanner;

public class U01ejerc13 {
    public static void main(String args[]){

        Scanner sc;

        int b500, b200, b100, b50, b20, b10, b5, m1;

        sc = new Scanner(System.in);

        System.out.println("Introduzca una cantidad entera de €: ");
        m1 = sc.nextInt(); //Utilizamos m1 como variable auxiliar hasta el último paso en el que obtenemos su valor.
        b500 = m1/500;
        m1 = m1%500;
        b200 = m1/200;
        m1 = m1%200;
        b100 = m1/100;
        m1 = m1%100;
        b50 = m1/50;
        m1 = m1%50;
        b20 = m1/20;
        m1 = m1%20;
        b10 = m1/10;
        m1 = m1%10;
        b5 = m1/5;
        m1 = m1%5;

        System.out.printf("500 €: %d%n200 €: %d%n100 €: %d%n50 €: %d%n20 €: %d%n10 €: %d%n5 €: %d%n1 €: %d%n", b500,
                b200, b100, b50, b20, b10, b5, m1);
    }
}

