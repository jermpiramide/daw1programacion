// Ejemplo de uso de la clase JOptionPane

import javax.swing.JOptionPane;

public class U03ejempJOptionPane {
    public static void main(String arg[]){

        String nombre;

        nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");

        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", encantado de conocerte.");
    }
}
