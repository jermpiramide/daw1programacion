// Muestra la tabla de multiplicar de un número n
// introducido por el teclado (utilizando do while)

import java.util.Scanner;

public class U02ejemp09 {
    public static void main(String args[]){

        Scanner sc;
        int numero;
        int j;

        sc = new Scanner(System.in);
        j = 0;

        System.out.println("Itroduzca un número: ");
        numero = sc.nextInt();

        /*
        for(int i=0; i<=9; i++){
            System.out.println(numero + "x" + i + "=" + (numero*i));
        }
        */

        do {
            System.out.println(numero + "x" + j + "=" + (numero * j));
            j++;
        } while(j<=9);
    }

    /*

    // Muestra las tablas de multiplicar del 1 al 10 de un número n
    // introducido por el teclado (utilizando do while)

        public static void main(String args[]){

        Scanner sc;
        int numero, i, j;

        sc = new Scanner(System.in);
        i = 1;
        j = 1;

        System.out.println("Introduce un número: ");

        numero = sc.nextInt();

        do{
            System.out.printf("Tabla del %d\n", i);

            do{
                System.out.printf("%dx%d=%d\n", i, j, (i*j));
                j++;
            } while (j<=10);

            j = 1;
            i++;
        } while(i<=numero);
    }
}
     */

}
