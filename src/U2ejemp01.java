// Realiza un programa que pida una hora por teclado y que muestre luego buenos días,
// buenas tardes o buenas noches según la hora.
// Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente.
// Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
// Además, si la hora introducida es distinta del rango 0-23 se indicará por pantalla
// que no es correcta.

import java.util.Scanner;

public class U2ejemp01 {
    public static void main(String args[]){

        Scanner sc;
        int hora;

        sc = new Scanner(System.in);

        System.out.println("Introduzca la hora del día (como número entero, sin minutos):");
        hora = sc.nextInt();

        if(hora<0){
            System.out.println("El dato introducido es incorrecto.");
        } else if(hora<6){
            System.out.println("Buenas noches.");
        } else if(hora<13){
            System.out.println("Buenos días.");
        } else if(hora<21){
            System.out.println("Buenas tardes.");
        } else if(hora<25){
            System.out.println("Buenas noches.");
        } else{
            System.out.println("El dato introducido es erróneo.");
        }
    }
}
