// Escribe un programa que lea una lista de varios números introducidos por teclado
// separados por espacios y determine cuantos son positivos y cuantos negativos

//Tenemos un error en tiempo de ejecución. El bucle while se comporta como un bucle infinito.

import java.util.Scanner;

public class U2ejemp14 {
    public static void main(String args[]){

        Scanner sc;
        int npositivos, nnegativos, nceros, aux;

        sc = new Scanner(System.in);
        npositivos = 0;
        nnegativos = 0;
        nceros = 0;

        System.out.println("Introduce una lista de número enteros separados por un espacio: ");

        while(sc.hasNextInt()){
            aux = sc.nextInt();
            if(aux>0){
                npositivos++;
            } else if(aux<0){
                nnegativos++;
            } else{
                nceros++;
            }
        }

        System.out.printf("Número de positivos: %d%nNúmero de negativos: %d%nNúmero de ceros: %d%n", npositivos, nnegativos, nceros);
    }
}
