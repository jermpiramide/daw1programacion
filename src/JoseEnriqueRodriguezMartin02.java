
import java.util.Scanner;

public class JoseEnriqueRodriguezMartin02 {

    public static void main(String args[]) {

        Scanner sc;
        int posicion, fallos;
        String palabra;
        String[] palabrasecreta = {"casa", "montaña", "coche", "berenjena", "oceano"};
        char aux;
        char[] registro = {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_',};      //Registra todas las letras utilizadas.
        char[] registrofalladas = {'0', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char[] palabraahorcada;     //En esta variable almacenamos la palabra secreta por caracteres.
        char[] palabraintento;      //En esta variable almacenamos las letras acertadas de la palabra secreta.
        boolean ganaste;        //Controla si el jugador ha ganado o no.

        sc = new Scanner(System.in);

        fallos = 0;     //Utilizaremos esta variable como índice para colocar los errores en el array correspondiente.
        ganaste = false;

        //Generamos un número aleatorio en el intervalo [0,5) y lo redondeamos a su valor entero más bajo (elegimos
        // ese intervalo para que las probabilidades de los cinco números sean las mismas. Después lo casteamos
        // para cambiarlo de tipo de variable a entero.
        posicion = (int) (Math.floor((Math.random() * 5)));
        palabra = palabrasecreta[posicion];

        //Convertimos el String palabra en el array palabraahorcada.
        palabraahorcada = stringAChar(palabra);

        //Llenamos el array palabra intento de guiones bajos.
        palabraintento = guionesBajos(palabraahorcada.length);

        //Mostramos por pantalla los huecos para las letras.
        System.out.println("¡Comencemos!");

        //Bucle para los intentos.
        for(int i=0; i<10; i++) {

            System.out.printf("Intentos restantes: %d%n", (10 - i));
            System.out.printf("Palabra: ");
            muestraArray(palabraintento);

            System.out.println("Introduce una letra: ");
            aux = sc.next().charAt(0);

            //Comprobamos si el carácter es correcto.
            if (compruebaCaracter(aux, registro)) {

                registro[i] = aux;      //Registramos el carácter.

                //Comprobamos si el carácter está en la palabra.
                if (compruebaAhorcado(aux, palabraahorcada)){
                    if(i<9) {
                        System.out.println("¡Acertaste!");
                        System.out.printf("%n%nContinuemos...");
                    }

                    //Modificamos el intento para incluir en él los caracteres acertados.
                    palabraintento = cambioCaracteresAcertados(aux, palabraahorcada, palabraintento);
                }else{
                    System.out.println("¡Error!");
                    System.out.printf("%n%n");
                    if(i<9) {
                        System.out.printf("%n%nContinuemos...");
                    }

                    //Registramos el fallo.
                    registrofalladas[fallos] = aux;
                    fallos++;
                }
            } else {
                //System.out.println("El carácter introducido está repetido o no es una letra minúscula.");
                i--;        //Descontamos una unidad del índice para que esta iteración no se cuente.
                continue;
            }

            //Comprobamos si han sido acertados todos los caracteres.
            ganaste = arraysIguales(palabraahorcada, palabraintento);
            if(ganaste == true){
                System.out.println();
                System.out.println("¡Ganaste!");
                break;
            }else {
                System.out.println();
                System.out.println("Letras falladas: ");
                muestraArray(registrofalladas);
            }
        }

        //Si se han terminado los intentos y no se han acertado todas las letras mostramos un mensaje.
        if(ganaste == false){
            System.out.println();
            System.out.println("¡Perdiste!");
        }
    }


    public static char[] stringAChar(String cadena) {
        //Esta función convierte un String en un array de caracteres.
        char[] caracteres;
        caracteres = new char[cadena.length()];

        //Bucle para asignar a cada término del array caracteres el carácter correspondiente del String cadena.
        for (int i = 0; i < cadena.length(); i++) {
            caracteres[i] = cadena.charAt(i);
        }

        return caracteres;
    }

    public static char[] guionesBajos(int n) {
        //Esta función devuelve un array de tipo char con n guiones bajos.
        char[] aux;
        aux = new char[n];

        for (int i = 0; i < n; i++) {
            aux[i] = '_';
        }

        return aux;
    }

    public static void muestraArray(char[] palabra) {
        //Esta función muestra por pantalla tantos "_ " como letras tiene la palabra.

        for (int i = 0; i < (palabra.length); i++) {
            System.out.printf("%c ", palabra[i]);
        }
        System.out.println();
    }

    public static boolean compruebaCaracter(char caracter, char[] lista) {
        //Esta función comprueba si el carácter cumple con las condiciones indicadas (no repetido y en minúsculas)
        // y devuelve true en caso de cumplir y false en caso de no cumplir.

        if (caracterRepetido(caracter, lista)) {      //Comprobamos si el carácter ya ha sido utilizado.
            System.out.println("Esta letra ya la habías utilizado. Inténtalo de nuevo con otra letra.");
            System.out.println();
            return false;
        } else if (caracterIncorrecto(caracter)) {        //Comprobamos si el carácter es una letra minúscula.
            System.out.println("El carácter que has introducido no es válido. Prueba de nuevo con una letra minúscula.");
            System.out.println();
            return false;
        } else {
            return true;
        }
    }

    public static boolean caracterRepetido(char caracter, char[] lista) {
        //Esta función comprueba si el carácter ya ha sido utilizado. En caso de haber sido utilizado devuelve true.

        //Bucle para recorrer lista y comprobar si algún término es igual a caracter.
        for (int i = 0; i < (lista.length); i++) {
            //Comprobamos si el caracter es igual al i-ésimo término de lista.
            if (caracter == lista[i]) {
                return true;
            }
        }

        return false;
    }

    public static boolean caracterIncorrecto(char caracter) {
        //Esta función comprueba si el carácter es una letra minúscula. En caso de no ser una letra minúscula devuelve
        //true.

        int a, z, eneespanola, aux;

        //Obtenemos los valores ASCII de a, z, ñ.
        a = 'a';
        z = 'z';
        eneespanola = 'ñ';
        aux = caracter;

        //Comprobamos si el carácter es una letra minúscula.
        if (aux < a || aux > z) {
            if (aux != eneespanola) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static boolean compruebaAhorcado(char caracter, char[] palabra){
        //Esta función comprueba si el carácter se encuentra en la palabra.

        for(int i=0; i<(palabra.length); i++){
            if(caracter == palabra[i]){
                return true;
            }
        }

        return false;
    }

    public static char[] cambioCaracteresAcertados(char caracter, char[] palabra, char[] intento){
        //Esta función devuelve un array char en el que se encuentran todos los caracteres acertados hasta el momento.

        for(int i=0; i<(palabra.length); i++){
            if(caracter == palabra[i]) {
                intento[i] = caracter;
            }
        }

        return intento;
    }

    public static boolean arraysIguales(char[] array1, char[] array2){

        for(int i=0; i<(array1.length); i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }

        return true;
    }




}