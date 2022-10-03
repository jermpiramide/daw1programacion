/*
4. Escribe un programa que defina una constante que represente el número de meses del año y una variable para
almacenar un número de mes, inicializado con el valor que desees. El programa debe imprimir por pantalla el orden
(número) de mes y la porción de año transcurrida. Un ejemplo de ejecución posible:

Mes 8 de 12

Porcentaje transcurrido: 66.6667%

Prueba con otros valores iniciales del número de mes para asegurarte de su funcionamiento.
 */


public class U01ejerc04 {
    public static void main(String args[]) {
        final int NMESES;
        int mesactual;
        double porcentaje;

        NMESES = 12;
        mesactual = 5;
        porcentaje = (((double) mesactual) / NMESES)*100;

        System.out.println(porcentaje);

        System.out.println("El año tiene " + NMESES + " y estamos en el mes número " + mesactual + ".");
        System.out.printf("Porcentaje transcurrido del año: %.3f %n", porcentaje);
        // ¿Cómo se pone el símbolo % dentro de la cadena de caracteres?
        // Porque si ponemos "bla bla bla %" toma el % como un comando.
    }
}
