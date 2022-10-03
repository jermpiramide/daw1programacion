/* Escribe un programa que permita calcular la cantidad mensual a pagar y el pago total para
un préstamo de una cantidad, un interés anual, y en una duración en años dada. La fórmula para
calcular el pago mensual es la siguiente: cantidad*interés mensual1-1(1+interés mensual)número
 de pagos
        Ejemplos de ejecución:
        Introducción de datos para el cálculo
        Cantidad prestada: 100000
        Interés anual (%): 5.75
        Duración del préstamo en años: 15
        * Resultado de la operación
        Cantidad prestada: 100000 euros
        Interés anual: 5.75%
        Duración del préstamo en años: 15
        Número de pagos: 180
        Pago mensual: 830.414 euros
        Cantidad total a pagar: 149474 euros


        Introducción de datos para el cálculo
        Cantidad prestada: 50000
        Interés anual (%): 7
        Duración del préstamo en años: 10
        * Resultado de la operación
        Cantidad prestada: 50000 euros
        Interés anual: 7%
        Duración del préstamo en años: 10
        Número de pagos: 120
        Pago mensual: 580.541 euros
        Cantidad total a pagar: 69664.9 euros
 */

import java.util.Scanner;

public class U01ejerc14 {
    public static void main(String args[]){

        Scanner sc;
        double prestamo, cuotam, cuotat, interesa, tiempoa;

        sc = new Scanner(System.in);

        System.out.println("Introduzca, separado por espacios, la cuantía del préstamo, " +
                "el interés anual y la duración en años: ");
        prestamo = sc.nextDouble();
        interesa = sc.nextDouble();
        tiempoa = sc.nextDouble();

        cuotat = (prestamo*interesa*tiempoa/100)+prestamo;
        cuotam = cuotat/(tiempoa*12);

        System.out.printf("Préstamo: %.2f €%nInteres anual: %.2f %%%nDuración en años: %.0f años%nNúmero de cuotas:" +
                " %.0f%nCuota mensual: %.2f €%nCuota total: %.2f €%n", prestamo, interesa, tiempoa, (tiempoa*12),
                cuotam, cuotat);
    }
}
