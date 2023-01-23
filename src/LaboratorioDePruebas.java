// Esta es una clase para poder hacer pruebas. Como si se tratara de una hoja en sucio.

import java.util.Scanner;

public class LaboratorioDePruebas {

    public static void main(String args[]){

        String cadena1="Casa";
        String cadena2="Manzana";
        String cadena3="Manzana";

        System.out.println(cadena1 + cadena2 + cadena3);

        System.out.println(cadena1.equals(cadena2)); // Returns true because they are equal
        System.out.println(cadena2.equals(cadena3)); // false

    }

}
