//Realiza un programa que pida dos números enteros y luego muestre el resultado de su multiplicación.
//Pista: Para este ejercicio hay que utilizar una clase que se llama Scanner. Si quieres investigar,
//hazlo. Si no, lo veremos en clase

import java.util.Scanner;

public class U01ejemp07 {
    public static void main(String args[]){
        Scanner sc;
        sc = new Scanner(System.in);
        int a;
        double b;

        System.out.println("Por favor, introduzca el valor de a (como número int): ");
        a = sc.nextInt();
        System.out.println("Por favor, introduzca el valor de b (como número double): ");
        /* Hay que tener cuidado con el separador de decimales porque dependiendo del contexto habrá que utilizar la
        coma o el punto por cómo se comunican el SO y el IDE. */
        b = sc.nextDouble();

        System.out.println(a);
        System.out.println(b);
    }
}
