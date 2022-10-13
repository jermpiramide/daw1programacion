// Realiza un programa que a partir de una nota (entera) introducida por teclado,
// visualice su calificación correspondiente: insuficiente, suficiente, bien, notable y sobresaliente.

import java.util.Scanner;

public class U02ejemp03 {
    public static void main(String args[]){

        Scanner sc;
        double nota;

        sc = new Scanner(System.in);

        System.out.println("Introduzca la nota numérica: ");
        nota = sc.nextDouble();

        if (nota<0){
            System.out.println("El dato es erróneo.");
        } else if (nota<5){
            System.out.println("Insuficiente.");
        } else if (nota<6){
            System.out.println("Suficiente.");
        } else if (nota<7){
            System.out.println("Bien.");
        } else if (nota<9){
            System.out.println("Notable.");
        } else if (nota<=10){
            System.out.println("Sobresaliente.");
        } else{
            System.out.println("El dato introducido es incorrecto.");
        }
    }
}