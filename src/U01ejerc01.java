/*
1. Escribe un programa en el que se muestren por pantalla tus datos personales, cada uno de ellos en una línea
 (nombre, primer apellidos, segundo apellido, localidad en la que vives, deporte favorito y número de años que
 llevas programando).
 */

public class U01ejerc01 {
    public static void main(String arg[]){
        String nombre, apellido1, apellido2, localidad, deporte;
        int aexperiencia;

        nombre = "Enrique";
        apellido1 = "Rodríguez";
        apellido2 = "Martín";
        localidad = "Huesca";
        deporte = "Escalada";
        aexperiencia = 4;

        System.out.println("Nombre: " + nombre);
        System.out.println("Primer apellido: " + apellido1);
        System.out.println("Sedundo apellido: " + apellido2);
        System.out.println("Localidad donde reside: " + localidad);
        System.out.println("Deporte favorito: " + deporte);
        System.out.println("Años de experiencia programando: " + aexperiencia);
    }
}
