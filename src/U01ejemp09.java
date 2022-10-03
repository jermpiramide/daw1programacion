//Escribe un programa que pida por teclado una cantidad en segundos y devuelva su correspondencia a horas, minutos
// y segundos. Pista: Tendremos que jugar con las divisiones y los restos.

import java.util.Scanner;

public class U01ejemp09 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int segundos, minutos, horas;

        System.out.println("Por favor, escribe el tiempo en segundos (como un número entero):");
        segundos = sc.nextInt();

        minutos = segundos/60;
        segundos = segundos%60;
        horas = minutos/60;

        System.out.println("Horas: " + horas + " h\n" + "Minutos: " + minutos + " '\n" + "Segundos: " + segundos + " ''");
    }
}
