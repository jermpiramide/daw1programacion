/*
Modifica el programa anterior para que se puedan guardar hasta 30 calificaciones. El programa
pedirá calificaciones al usuario hasta que éste introduzca una nota negativa (o se llene el
array). El programa, además de lo requerido en el ejercicio anterior, mostrará la nota máxima
llamando a un método que se encargue de encontrarla.
*/

import java.util.Scanner;

public class U03ejerc09 {
    public static void main(String args[]){

        double[] numero, minmax;
        double media;
        int aprobados, suspensos;
        boolean signo;

        numero = new double[30];
        minmax = new double[2];

        signo = pideAlmacenaNumeros(numero);

        if(signo){
            muestraArrayEnLineas(numero);
            media = calculaMedia(numero);
            aprobados = cuentaAprobados(numero);
            suspensos = numero.length - aprobados;
            buscaMinMax(numero, minmax);

            System.out.printf("Nota media del curso: %.2f\n", media);
            System.out.println("Número de aprobados: " + aprobados);
            System.out.println("Número de suspensos: " + suspensos);
            System.out.println("Nota mínima: " + minmax[0]);
            System.out.println("Nota máxima: " + minmax[1]);
        }else{
            System.out.println("Has introducido un número negativo.");
        }
    }

    public static boolean pideAlmacenaNumeros(double[] numero){

        Scanner sc;

        sc = new Scanner(System.in);

        for(int i=0; i<numero.length; i++){
            System.out.println("Introduzca un número: ");
            numero[i] = sc.nextDouble();

            if(numero[i]<0) {
                return false;
            }
        }
        return true;
    }

    public static void muestraArrayEnLineas(double[] array){

        for(int i=0; i<array.length; i++){
            System.out.println("Nota: " + array[i]);
        }

        System.out.println();
    }

    public static double calculaMedia(double[] datos){

        double suma, media;

        suma = sumaArray(datos);
        media = suma/(datos.length);

        return media;
    }

    public static double sumaArray(double[] datos){

        double suma;

        suma = 0;

        for(int i=0; i<datos.length; i++){
            //suma = suma+datos[i];
            suma += datos[i];
        }

        return suma;
    }

    public static int cuentaAprobados(double[] nota) {

        int contador;

        contador = 0;

        for (int i = 0; i < nota.length; i++) {
            if (nota[i] >= 5) {
                contador++;
            }
        }

        return contador;
    }

    public static void buscaMinMax(double[] numero, double[] minmax){

        minmax[0] = numero[0];
        minmax[1] = numero[0];

        for(double num :numero){
            minmax[0] = Math.min(minmax[0], num);
            minmax[1] = Math.max(minmax[1], num);
        }
    }
}
