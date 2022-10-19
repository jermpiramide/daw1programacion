//Implementa un programa que pida al usuario las calificaciones (double) de los 10 estudiantes
// de una clase y los guarde en un array. Después, mostrará esas calificaciones (cada una en
// una línea), seguida de la media del curso y del número de aprobados y suspensos. Se usará un
// método para calcular la nota media y otro para el número de suspensos.

import java.util.Scanner;

public class U03ejerc08 {
    public static void main(String args[]){

        double[] numero;
        double media;
        int aprobados, suspensos;

        numero = new double[10];

        pideAlmacenaNumeros(numero);
        muestraArrayEnLineas(numero);
        media = calculaMedia(numero);
        aprobados = cuentaAprobados(numero);
        suspensos = numero.length-aprobados;

        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);

    }

    public static void pideAlmacenaNumeros(double[] numero){

        Scanner sc;

        sc = new Scanner(System.in);

        for(int i=0; i<numero.length; i++){
            System.out.println("Introduzca un número: ");
            numero[i] = sc.nextDouble();
        }
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
}
