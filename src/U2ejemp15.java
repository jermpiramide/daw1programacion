// Utilización de la clase Math para hacer una calculadora que haga raices cuadradas
// y divisiones y si una operación no es posible lo comunique. Nos permitirá introducir
// las operaciones mediante un menú, y no terminará hasta que le digamos que lo haga.

import java.util.Scanner;

public class U2ejemp15 {
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
