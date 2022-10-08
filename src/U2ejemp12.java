// Escribe un prograna que muestre los n primeros términos de la serie de Fibonacci.
// El primer término es el 0, el segundo el 1 y el resto se calcula sumando
// los dos anteriores. (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...) El número n se introducirá por teclado.
import java.util.Scanner;

public class U2ejemp12 {
    public static void main(String args[]){

        Scanner sc;
        int cantidad, fibo1, fibo2;

        sc = new Scanner(System.in);
        fibo2 = 1;
        fibo1 = 0;

        System.out.println("Introduzca la cantidad de términos que quiere visualizar por pantalla: ");
        cantidad = sc.nextInt();

        System.out.printf("Término número 1: %d%n", fibo1);

        fibo1 = fibo2;

        for (int i=1; i<cantidad; i += 2){
            System.out.printf("Término número %d: %d%n", (i+1), fibo1);
            System.out.printf("Término número %d: %d%n", (i+2), fibo2);
            fibo1 = fibo1 + fibo2;
            fibo2 = fibo1 + fibo2;
        }
    }
}
