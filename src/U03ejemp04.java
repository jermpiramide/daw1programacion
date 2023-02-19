// Almacena una palabra en un array de caracteres. Imprimela.
// Luego hazlo con un String. Saca sus caracteres con charAt(i)

public class U03ejemp04 {
    public static void main(String args[]){

        char[] palabra1 = {'h', 'o', 'l', 'a'};
        String palabra2 = "adios";
        String palabra3 = new String("bye");



        System.out.println("palabra1: " + palabra1);//Esto no nos va a imprimir los caracteres almacenados en el objeto
        // "palabra1" si no que nos va a dar un hash relacionado con la dirección de la memoria en la que se
        // almacena el objeto.
        System.out.println("palabra2: " + palabra2);

        for(int i = 0; i<palabra2.length(); i++){
            System.out.println("El carácter en la posición " + i + " es: " + palabra2.charAt(i));
        }

        System.out.println("palabra3: " + palabra3);

        palabra2 = "bye"; // Asignamos el valor "bye" al objeto palabra2.

        System.out.println(palabra2.equals(palabra3)); // El método .equals() compara el contenido de dos String. En
        // este caso, el contenido de las direcciones de memoria a las que apuntan ambos objetos es el mismo: "bye".
        System.out.println(palabra2==palabra3); // El operador == compara las direcciones de memoria de dos variables.
        // En este caso, aunque el contenido de las direcciones de memoria a las que apuntan ambas variables es el
        // es el mismo, cada variable almacena una dirección de memoria diferente. Es decir, que ambas variables
        // almacenan la misma información, pero en lugares de memoria diferentes.


        palabra2 = palabra3; // Asignamos la dirección de memoria de la variable palabra3 a la variable palabra2. De
        // esta forma ambas variables apuntan a la misma dirección de memoria.


        System.out.println(palabra2.equals(palabra3));
        System.out.println(palabra2==palabra3);

        /*
        https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/

        Both equals() method and the == operator are used to compare two objects in Java. == is an operator and
        equals() is method. But == operator compares reference or memory location of objects in a heap, whether they
         point to the same location or not.
         Whenever we create an object using the operator new, it will create a new memory location for that object. So we use the == operator to check memory location or address of two objects are the same or not.

         In general, both equals() and “==” operators in Java are used to compare objects to check equality, but here are some of the differences between the two:

        The main difference between the .equals() method and == operator is that one is a method, and the other is the operator.
        We can use == operators for reference comparison (address comparison) and .equals() method for content comparison. In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
        If a class does not override the equals method, then by default, it uses the equals(Object o) method of the closest parent class that has overridden this method. See Why to Override equals(Object) and hashCode() method? in detail.
         */
    }
}
