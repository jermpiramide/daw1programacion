//Escribe un programa que calcule el perímetro del círculo. (Pi debe ser una constante).
//Pista: una constante se declara como una variable anteponiendo la palabra final delante.
//Además su nombre lo escribimos TODO CON MAYÚSCULAS para distinguirlo. El símbolo de la multiplicación es *

public class U01ejemp03 {
    public static void main(String args[]){
        final double PI = 3.1416;
        int radio = 6;
        double perimetro = 2*PI*radio;
        System.out.print("El perímetro es: " + perimetro + " m²");
    }
}
