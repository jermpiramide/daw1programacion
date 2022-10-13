// Escribe un programa en que se pida un número del 1 al 7 y responda con
// el nombre del día de la semana correspondiente.

import java.util.Scanner;

public class U02ejemp04 {
    public static void main(String args[]){

        Scanner sc;
        int numero;

        sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero entre el 1 y el 7: ");
        numero = sc.nextInt();

        switch (numero){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El número introducido es incorrecto.");
        }
    }
}
