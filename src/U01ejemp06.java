//Crea un programa con las variables nombre, dirección y teléfono y asígnale los valores correspondientes
// a tus datos personales. Muestra los valores de estas variables por pantalla en tres líneas distintas.
// Pista: Las cadenas de caracteres se almacenan en variables de tipo String.

public class U01ejemp06 {
    public static void main(String args[]){
        String nombre;
        String direccion;
        String telefono;

        nombre = "Enrique";
        direccion = "C/ Monegros 20";
        telefono = "666666666";

        System.out.println(nombre + "\n" + direccion + "\n" + telefono);
    }
}
