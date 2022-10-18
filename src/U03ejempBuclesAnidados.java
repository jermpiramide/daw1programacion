// Muestra las tablas de multiplicar del 1 al 10

public class U03ejempBuclesAnidados {
    public static void main(String args[]){

        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++) {
                System.out.printf("%2dx%2d=%3d\n", i, j, (i * j)); //El código "%2d" o justifica el dato mostrado por
                //pantalla a la derecha, mostrando el dato indicado e insertando espacios en blanco en el resto de
                // de caracteres hasta alcanzar un mínimo de 2 caracteres en total. Si el dato es superior a la
                // cantidad mínima de caracteres indicados, se muestra el dato completo sin mostrar ningún espacio en
                // blanco.
            }

            System.out.println();
        }

        for(int i=1; i<=10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%-2dx%-2d=%-3d\n", i, j, (i * j)); //El código "%-2d" justifica el dato mostrado por
                //pantalla a la izquierda, mostrando el dato indicado e insertando espacios en blanco en el resto de
                // de caracteres hasta alcanzar un mínimo de 2 caracteres en total. Si el dato es superior a la
                // cantidad mínima de caracteres indicados, se muestra el dato completo sin mostrar ningún espacio en
                // blanco.
            }

            System.out.println();
        }
    }
}
