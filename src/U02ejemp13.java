
// Escribir diferentes métodos para comprobar si un número es primo o compuesto.


//Si introducimos un número muy grande da error. Probar con 12345678901234567890 (20 dígitos).

import java.util.Scanner;

public class U02ejemp13 {
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

        if (numero==0){
            //Comprobamos si el número es cero. Por cómo se definen los números primos, el número
            // cero no es un número primo.
            prueba = false;
            return prueba;
        }else if(numero==1 || numero==2){
            //Comprobamos si el número es 1 o 2.
            return prueba;
        } else if ((numero%2)==0){
            //Obviamos la comprobación de si el número es divisible por cero (ninguno lo es) o por uno (todos lo son).
            //Comprobamos en primer lugar si es divisible entre dos. Con esto descartamos directamente que sea
            //divisible entre cualquier número par.
            prueba = false;
            return prueba;
        } else {
            //Comprobamos si es divisible entre un número impar distinto de cero.

            //Empezamos el bucle en i=3 y le sumamos 2 en cada ciclo para saltarnos los números pares.
            for (int i = 3; i < (numero / 2); i+=2) {
                //Ponemos la condición numero/2 porque ningún número es divisible por un número mayor que la
                // mitad de su valor.
                if ((numero % i) == 0) {
                    prueba = false;
                    return prueba; //En cuanto se ejecuta un return se sale del método.
                }
            }
        }

        return prueba;
    }
}
