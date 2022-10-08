// Escribe un prograna que muestre los n primeros términos de la serie de Fibonacci.
// El primer término es el 0, el segundo el 1 y el resto se calcula sumando
// los dos anteriores. (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...) El número n se introducirá por teclado.
import java.util.Scanner;

public class U2ejemp12 {
    public static void main(String args[]){

        Scanner sc;
        int cantidad, fibo1, fibo2;

        sc = new Scanner(System.in);
        //Inicializamos las variables fibo1 y fibo2 con los dos primeros términos de la serie de Fibonacci.
        //Estos dos primeros términos son especiales ya que son las semillas que utiliza el algoritmo de
        //Fibonacci para generar la serie.
        fibo1 = 0;
        fibo2 = 1;

        System.out.println("Introduzca la cantidad de términos que quiere visualizar por pantalla: ");
        cantidad = sc.nextInt();

        //Realizamos mediante un bucle los sucesivos pasos del algoritmo calculando dos términos por iteración.
        for (int i=0; i<cantidad; i += 2){
            System.out.printf("Término número %d: %d%n", (i+1), fibo1);
            fibo1 = fibo1 + fibo2;
            if (i<(cantidad-1)){
                System.out.printf("Término número %d: %d%n", (i+2), fibo2);
                fibo2 = fibo1 + fibo2;
            }
        }
    }
}
