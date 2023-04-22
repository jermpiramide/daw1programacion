/*
Implementa un programa que determine la frecuencia de aparición de cada letra en una cadena de caracteres introducida
por teclado. Comenzará solicitando la cadena y, posteriormente, construirá un array con las frecuencias de cada letra.
Finalmente, imprimirá el array de frecuencias por pantalla. Cuanto más preciso sea, mejor (ten en cuenta tildes,
diéresis, símbolos...) (NOTA: No debe ser sensible a mayúsculas/minúsculas)
*/

import java.util.Scanner;

public class U03ejerc16 {

    public static void main(String Args[]){

        Scanner sc;
        String cadena, caracter;
        int[] frecuencia;

        sc = new Scanner(System.in);
        caracter = ""; // Instanciamos e inicializamos el String caracteres dejándolo vacío.

        System.out.println("Introduce una cadena de caracteres: ");
        cadena = sc.nextLine();

        caracter = lista_Caracteres(cadena, caracter); // Obtenemos una lista de los caracteres que hay en cadena.
        frecuencia = new int[caracter.length()]; // Los elementos de un array se inicializan de forma predeterminada
        // con valores igual a 0.
        cuenta_Caracteres(cadena, caracter, frecuencia);

        System.out.println("Estos son los caracteres: " + caracter);
        muestra_Caracter_Frecuencia(caracter,frecuencia);
    }

    public static String lista_Caracteres(String cadena, String caracter){

        Boolean control;

        caracter = caracter + cadena.charAt(0); // Le asignamos a caracter su primer elemento. Puesto que
        // cadena.charAt() nos devuelve un char, no podemos asignárselo directamente al String caracter debido a que
        // éste es de tipo String. Sin embargo, utilizando el operador + lo que hacemos es añadir el dato de tipo char
        // que nos devuelve cadena.charAt() al final del String caracter.

        for(int i=1; i<cadena.length(); i++){
            // El índice empieza en 1 porque el primer el primer carácter ya lo hemos añadido al String caracter.

            control = false;

            for(int j=0; j<caracter.length(); j++) {
                if(cadena.charAt(i)==caracter.charAt(j)){
                    control = true; // Marcamos el carácter como ya existente.
                    j = caracter.length(); // Asignamos a j un valor superior al límite del bucle.
                }
            }

            if(control==false){
                caracter = caracter + cadena.charAt(i);
            }
        }

        return caracter;
    }

    public static void cuenta_Caracteres(String cadena, String caracter, int[] contador){

        for(int i=0; i<caracter.length(); i++){
            for(int j=0; j<cadena.length(); j++){
                if(caracter.charAt(i)==cadena.charAt(j)){
                    contador[i]++;
                }
            }
        }

        return;
    }

    public static void muestra_Caracter_Frecuencia(String caracter, int[] frecuencia){

        for(int i=0; i<caracter.length(); i++){
            System.out.printf("Frecuencia del caracter '%c': %d\n",caracter.charAt(i),frecuencia[i]);
        }
    }
}
