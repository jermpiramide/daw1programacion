// Almacena una palabra en un array de caracteres. Imprimela.
// Luego hazlo con un String. Saca sus caracteres con charAt(i)

public class U03ejemp04 {
    public static void main(String args[]){

        char[] palabra1 = {'h', 'o', 'l', 'a'};
        String palabra2 = "adios";
        String palabra3 = new String("bye");



        System.out.println("palabra1: " + palabra1);//Esto no nos va a imprimir los caracteres almacenados en
        // "palabra1" si no que nos va a dar un hash relacionado con la dirección de la memoria en la que se
        // almacena la variable.
        System.out.println("palabra2: " + palabra2);

        for(int i = 0; i<palabra2.length(); i++){
            System.out.println("El carácter en la posición " + i + " es: " + palabra2.charAt(i));
        }

        System.out.println("palabra3: " + palabra3);

        palabra2 = "bye";

        System.out.println(palabra2.equals(palabra3));
        System.out.println(palabra2==palabra3);

        palabra2 = palabra3;


        System.out.println(palabra2.equals(palabra3));
        System.out.println(palabra2==palabra3);
    }
}
