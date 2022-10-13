//Debido a una pertinaz sequía se decidió poner en práctica un sistema de cobro de agua que penalice el consumo
// excesivo tal como indica la tabla siguiente:
//Consumo (en metros cúbicos)
//€ por metro cúbico
//Primeros 100
//0.15
//De 100 a 500
//0.20
//De 500 a 1000
//0.35
//Más de 1000
//0.80
//Escribe un programa que lea del teclado los metros cúbicos consumidos y muestre en la pantalla el coste de
// agua total. Ten en cuenta que en la tabla se indica lo que hay que cobrar por los metros cúbicos que se
// encuentran en el intervalo. Así si hemos consumido 750 deberíamos pagar:
// 100*0.15+400*0.20+250*0.35 = 182.50 €. Usa constantes.

import java.util.Scanner;

public class U2ejerc06 {
    public static void main(String arg[]){

        Scanner sc;
        double mcubicos, precio1, precio2, precio3, precio4, fintramo1, fintramo2, fintramo3, factura; //No declaramos
        //la variable "fintramo4" porque este tramo va desde "fintramo3" hasta el infinito.

        sc = new Scanner(System.in);
        precio1 = 0.15;
        precio2 = 0.2;
        precio3 = 0.35;
        precio4 = 0.8;
        fintramo1 = 100;
        fintramo2 = 500;
        fintramo3 = 1000;
        factura = 0;

        System.out.println("Introduzca los m³ consumidos: ");
        mcubicos = sc.nextDouble();

        while (mcubicos>0){
            if (mcubicos>fintramo3){
                factura = (mcubicos-fintramo3)*precio4;
                mcubicos = fintramo3;
            } else if (mcubicos>fintramo2){
                factura = factura+(mcubicos-fintramo2)*precio3;
                mcubicos = fintramo2;
            } else if (mcubicos>fintramo1){
                factura = factura+(mcubicos-fintramo1)*precio2;
                mcubicos = fintramo1;
            } else {
                factura = factura+mcubicos*precio1;
                mcubicos = 0;
            }
        }

        System.out.printf("Factura: %.2f €", factura);
    }
}
