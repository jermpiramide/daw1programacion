// Ejemplos de la clase Math.


public class U2ejempMath {
    public static void main(String args[]){

        double numero = 43.454;
        double base = 45.3;
        double exp = 75.2;

        System.out.printf("La raíz cuadrada de %f es %f.%n", numero, Math.sqrt(numero));
        System.out.printf("La potencia de %f elevado a %f es %f.%n", base, exp, Math.pow(base, exp));
        System.out.printf("El número pi es %f.%n", Math.PI);
    }
}
