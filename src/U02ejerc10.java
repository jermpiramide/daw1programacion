/*
Completa el ejemplo 15 que tienes en github para que cumpla con su enunciado.
El ejemplo de Github está desarrollado en U02ejemp15.
*/

import java.util.Scanner;

public class U02ejerc10 {
    public static void main(String args[]){

        Scanner sc;
        int menu;
        double dividendo, divisor, division, indice, radicando, raiz;

        sc = new Scanner(System.in);
        menu = 0;

        System.out.println("Introduzca '1' si desea calcular una división o introduzca '2' si desea calcular una" +
                " raíz o introduzca 3 para finalizar el programa: ");
        menu = sc.nextInt();

        while(menu!=3){
            //Si dividimos entre cero o hacemos la raíz de un número negativo la operación no da error.
            /*
            sqrt:
            public static double sqrt(double a)
            Returns the correctly rounded positive square root of a double value. Special cases:
                If the argument is NaN or less than zero, then the result is NaN.
                If the argument is positive infinity, then the result is positive infinity.
                If the argument is positive zero or negative zero, then the result is the same as the argument.
            Otherwise, the result is the double value closest to the true mathematical square root of the argument value.
            Parameters:
                a - a value.
            Returns:
                the positive square root of a. If the argument is NaN or less than zero, the result is NaN.
             */
            if(menu == 1){
                System.out.println("Introduzca el dividendo y el divisor separados por un espacio: ");
                dividendo = sc.nextDouble();
                divisor = sc.nextDouble();
                try{
                    division = dividendo/divisor;
                    System.out.printf("%.0f/%.0f=%.3f%n", dividendo, divisor, division);
                }catch (Exception e){
                    System.out.println("No es posible hacer la división.");
                }
            } else if(menu == 2){
                System.out.println("Introduzca el índice de la raíz y el radicando separados por un espacio: ");
                indice = sc.nextDouble();
                radicando = sc.nextDouble();
                try{
                    raiz = Math.pow(radicando,(1/indice));
                    System.out.printf("%.0f^(1/%.0f)=%.3f%n", radicando, indice, raiz);
                }catch (Exception e){
                    System.out.println("No es posible hacer la raíz.");
                }

            } else{
                System.out.println("No ha elegido ninguna opción correcta.");
            }
            System.out.println("Introduzca '1' si desea hacer una división o introduzca '2' si desea hacer una" +
                    " raíz o introduzca 3 para finalizar el programa: ");
            menu = sc.nextInt();
        }
        System.out.println("Se ejecuta hasta el final.");
    }
}
