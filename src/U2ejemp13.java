
// Escribir diferentes métodos para comprobar si un número es primo o compuesto.


//Si introducimos un número muy grande da error. Probar con 12345678901234567890 (20 dígitos).

import java.util.Scanner;

public class U2ejemp13 {
    public static void main(String args[]){

        Scanner sc;
        long numero;
        boolean prueba;

        sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        numero = sc.nextLong();

        prueba = esPrimo(numero);

        System.out.printf("¿El número %d es primo?: %b", numero, prueba);
    }

    public static boolean esPrimo(long numero){
        boolean prueba;

        prueba = true;

        //Empezamos el bucle en i=2 porque ningún número es divisible por cero y todos lo son entre uno.
        for(int i =2; i<(numero/2); i++){
            //Ponemos la condición numero/2 porque ningún número es divisible por un número mayor que la
            // mitad de su valor.
            if ((numero%i)==0){
                prueba = false;
                return prueba; //En cuanto se ejecuta un return se sale del método.
            }
        }

        return prueba;
    }
}
