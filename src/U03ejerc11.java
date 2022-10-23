// Modifica el programa anterior teniendo en cuenta que el número de dígitos binarios del
// número pueda ser cualquiera.

import java.util.Scanner;

public class U03ejerc11 {
    public static void main(String args[]) {
        //Tomamos un número binario como un String y calculamos directamente su valor en decimal.

        Scanner sc;
        int numerodecimal;
        String palabrabinaria;

        sc = new Scanner(System.in);

        System.out.println("Introduzca un número binario: ");
        palabrabinaria = sc.nextLine();

        numerodecimal = stringADecimal(palabrabinaria);

        if(numerodecimal >= 0){
            System.out.println(palabrabinaria + "=" + numerodecimal);
        }else{
            System.out.println("El número introducido no es binario.");
        }
    }

    public static int stringADecimal(String palabrabinaria){
        int longitud, numerodecimal;

        numerodecimal = 0;

        longitud = palabrabinaria.length();

        for(int i=(longitud-1); i>=0; i--){
            //Para discriminar los caracteres de "palabrabinaria" es MUY IMPORTANTE compararlos
            // con el carácter '1' y el carácter '0' y no directamente con los números 1 y 0.
            if(palabrabinaria.charAt(i)=='1'){
                numerodecimal += Math.pow(2, ((longitud-1)-i));
            }else if(palabrabinaria.charAt(i)=='0'){
                continue;
            }
            else{
                numerodecimal = -1;

                break;
            }
        }

        return numerodecimal;
    }
}
