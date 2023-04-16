/*
Teniendo en cuenta los datos que aparecen más abajo, realiza los siguientes métodos (corresponden a las notas de
3 alumnos en 4 asignaturas): Visualizar nota máxima, mínima y media de cada alumno. Visualizar nota máxima, mínima
y media de cada asignatura. Visualizar nota máxima, mínima y media del curso. A partir de una nota que se pedirá
por teclado, visualizar qué alumnos la han obtenido y en qué asignaturas (aunque en el ejemplo no se cumple, tened
en cuenta que una misma nota podría aparecer repetida en distintas posiciones de la matriz…).
DATOS:{ { 5.6, 9.5, 6.8, 7 },{ 7.9, 5.2, 5.7, 6.3 },{ 9.8, 8, 7.6, 8.5} }
 */

import java.util.Scanner;

public class U03ejerc13 {
    public static void main(String Args[]){

        double[][] nota = {{ 5.6, 9.5, 6.8, 7 },{ 7.9, 5.2, 5.7, 6.3 },{ 9.8, 8, 7.6, 8.5}}; // Cada fila representa
        // las notas de un alumno y cada columna representa las notas de una asignatura.

        max_Min_Med_Alumno(nota);
        max_Min_Med_Asignatura(nota);
        max_Min_Med_Curso(nota);
        alumno_Asignatura_Nota(nota);

    }

    public static void max_Min_Med_Alumno(double[][] nota){
    // Muestra las notas máxima, mínima y media de cada alumno.

        for(int i=0; i<nota.length; i++){
        // nota.length devuelve el número de filas del array.
            System.out.printf("La nota máxima del alumno número %d es: \n", i, nota_Maxima_Alumno(nota, i));
            System.out.printf("La nota mínima del alumno número %d es: \n", i, nota_Minima_Alumno(nota, i));
            System.out.printf("La nota media del alumno número %d es: \n", i, nota_Minima_Alumno(nota, i));
        }
    }

    public static void max_Min_Med_Asignatura(double[][] nota){
    // Muestra las notas máxima, mínima y media de cada asignatura.

        for(int i=0; i<nota[i].length; i++){
        // nota[i].length devuelve el número de columnas del array.
            System.out.printf("La nota máxima de la asignatura número %d es: \n", i, nota_Maxima_Asignatura(nota, i));
            System.out.printf("La nota máxima de la asignatura número %d es: \n", i, nota_Minima_Asignatura(nota, i));
            System.out.printf("La nota máxima de la asignatura número %d es: \n", i, nota_Minima_Asignatura(nota, i));
        }
    }

    public static void max_Min_Med_Curso(double[][] nota){
    // Muestra las notas máxima, mínima y media de cada curso.

        for(int i=0; i<nota[i].length; i++){
            // nota[i].length devuelve el número de columnas del array.
            System.out.printf("La nota máxima del curso es: \n", i, nota_Maxima_Curso(nota));
            System.out.printf("La nota máxima del curso es: \n", i, nota_Minima_Curso(nota));
            System.out.printf("La nota máxima del curso es: \n", i, nota_Minima_Curso(nota));
        }

    }

    public static void alumno_Asignatura_Nota(double[][] nota){
    // Pide una nota de referencia y muestra qué alumnos han obtenido dicha nota y en qué asignaturas.

        double nota_Referencia;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.println("Introduce la nota de referencia: ");
        nota_Referencia = sc.nextDouble();

        busca_Nota_Y_Muestra_Info(nota_Referencia, nota);
    }

    public static double nota_Maxima_Alumno(double[][] nota, int alumno){
    // Calcula la nota máxima de un alumno.
        double max;

        max = 0;

        for(int i=0; i<nota[alumno].length; i++){
            max = Math.max(max, nota[alumno][i]);
        }

        return max;
    }

    public static double nota_Minima_Alumno(double[][] nota, int alumno){
    // Calcula la nota mínima de un alumno.
        double min;

        min = 0;

        for(int i=0; i<nota[alumno].length; i++){
            min = Math.min(min, nota[alumno][i]);
        }

        return min;
    }

    public static double nota_Media_Alumno(double[][] nota, int alumno){
    // Calcula la nota media de un alumno.
        double med;

        med = 0;

        for(int i=0; i<nota[alumno].length; i++){
            med += nota[alumno][i];
        }

        med = med/nota[alumno].length;

        return med;
    }

    public static double nota_Maxima_Asignatura(double[][] nota, int asignatura){
    // Calcula la nota máxima de una asignatura.
        double max;

        max = 0;

        for(int i=0; i<nota.length; i++){
        // Recorremos los valores de la columna determinada por asignatura.
            max = Math.max(max, nota[i][asignatura]);
        }

        return max;
    }

    public static double nota_Minima_Asignatura(double[][] nota, int asignatura){
    // Calcula la nota mínima de una asignatura.
        double min;

        min = 0;

        for(int i=0; i<nota.length; i++){
        // Recorremos los valores de la columna determinada por asignatura.
            min = Math.min(min, nota[i][asignatura]);
        }

        return min;
    }

    public static double nota_Media_Asignatura(double[][] nota, int asignatura){
    // Calcula la nota media de una asignatura.
        double med;

        med = 0;

        for(int i=0; i<nota.length; i++){
        // Recorremos los valores de la columna determinada por asignatura.
            med += nota[i][asignatura];
        }

        med = med/nota.length; // Dividimos la suma de las notas entre el número de asignaturas, que se corresponde
        // con el número de filas.

        return med;
    }

    public static double nota_Maxima_Curso(double[][] nota){
        // Calcula la nota máxima de una asignatura.
        double max;

        max = 0;

        for(int i=0; i<nota.length; i++){
            for(int j=0; j<nota[i].length; j++){
                max = Math.max(max, nota[i][j]);
            }
        }

        return max;
    }

    public static double nota_Minima_Curso(double[][] nota){
        // Calcula la nota mínima de una asignatura.
        double min;

        min = 0;

        for(int i=0; i<nota.length; i++){
            for(int j=0; j<nota[i].length; j++){
                min = Math.min(min, nota[i][j]);
            }
        }

        return min;
    }

    public static double nota_Media_Curso(double[][] nota){
        // Calcula la nota media de una asignatura.
        double med;

        med = 0;

        for(int i=0; i<nota.length; i++){
            for(int j=0; j<nota[i].length; j++){
                med += nota[i][j];
            }
        }

        med = med/(nota.length * nota[0].length // Dividimos la suma de las notas entre el número de notas que
        // expresamos como filas*columnas.

        return med;
    }

    public static void busca_Nota_Y_Muestra_Info(double nota_Referencia, double[][] nota){
    // Dado un array de notas en 2D busca todas las posiciones en las que el valor nota_ref se encuentra en el array
    // y lo muestra por pantalla.

        bolean aux;

        aux = false; // Esta variable nos va a permitir saber si hay al menos una nota coincidente con nota_ref.

        for(int i=0; i<nota.length; i++){
            for(int j=0; j<nota[i].length; i++){
                if(nota[i][j]==nota_Referencia){
                    aux = true;
                    System.out.printf("El alumno número %d en la asignatura %d ha obtenido la calificación %f.\n");
                }
            }
        }

        if(aux==false){
            System.out.println("No hay ninguna nota que coincida con " + nota_Referencia + ".");
        }
    }

}
