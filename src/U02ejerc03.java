//Escribe un programa que lea del teclado dos números e indique si uno de ellos es múltiplo de otro.

import java.util.Scanner;

public class U02ejerc03 {
    public static void main(String args[]){

        Scanner sc;
        int numeroA, numeroB;

        sc = new Scanner(System.in);

        System.out.println("Introduce dos números enteros positivos: ");
        numeroA = sc.nextInt();
        numeroB = sc.nextInt();

        if (numeroA>numeroB){
            if ((numeroA%numeroB) == 0){
                System.out.printf("%d es múltiplo de %d.", numeroA, numeroB);
            } else {
                System.out.println("Ninguno de los números es múltiplo del otro.");
            }
        } else if (numeroB>numeroA) {
            if ((numeroB % numeroA) == 0) {
                System.out.printf("%d es múltiplo de %d.", numeroB, numeroA);
            } else {
                System.out.println("Ninguno de los números es múltiplo del otro.");
            }
        } else {
            System.out.println("Los dos números son idénticos.");
        }
    }
}
