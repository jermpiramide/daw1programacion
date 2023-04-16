/*
Implementa un programa que determine la frecuencia de aparición de cada vocal en una cadena de caracteres introducida
por teclado. Comenzará solicitando la cadena y, posteriormente, construirá un array con las frecuencias de cada vocal.
Finalmente, imprimirá el array de frecuencias por pantalla.(NOTA: No debe ser sensible a mayúsculas/minúsculas).
 */

import java.util.Scanner;

public class U03ejerc12 {

    public static void main(String Args[]){

        String cadena;
        Scanner sc;
        char caracter;
        int a, e, i, o, u;

        a = 0;
        e = 0;
        i = 0;
        o = 0;
        u = 0;

        sc = new Scanner(System.in);

        System.out.println("Introduce una palabra (sin tildes ni diéresis en las vocales): ");
        cadena = sc.nextLine();

        for(int j=0; j<cadena.length(); j++){
            caracter = cadena.charAt(j);

            switch(caracter){
                case 'a':
                case 'A':
                    a++;
                    break;
                case 'e':
                case 'E':
                    e++;
                    break;
                case 'i':
                case 'I':
                    i++;
                    break;
                case 'o':
                case 'O':
                    o ++;
                    break;
                case 'u':
                case 'U':
                    u++;
                    break;
            }
        }

        System.out.printf("La vocal a aparece %d veces.\n", a);
        System.out.printf("La vocal e aparece %d veces.\n", e);
        System.out.printf("La vocal i aparece %d veces.\n", i);
        System.out.printf("La vocal o aparece %d veces.\n", o);
        System.out.printf("La vocal u aparece %d veces.\n", u);

    }
}
