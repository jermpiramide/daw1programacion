//Escribe un programa en el que se declaren las variables enteras x e y. Asígnales los valores 1000 y 2000
//respectivamente. A continuación muestra por pantalla el valor de cada variable, la suma, la resta, la
//multiplicación, la división y el resto. Pista: suma +, resta -, multiplicación *, división /, resto %.
//La división es entera; Ej: 23:2 = 11, 23%2 = 1

public class U01ejemp04 {
    public static void main(String arg[]){
        int x;
        int y;

        x = 1000;
        y = 2000;

        System.out.println("x=" + x);
        System.out.println("y=" + y);

        System.out.println("x+y=" + (x+y) + "\nx-y=" + (x-y));
        System.out.println("x-y=" + (x-y));
        System.out.println("x*y=" + (x*y));
        System.out.println("x/y=" + (x/y));
        System.out.println("y/x=" + (y/x));
        System.out.println("x%y=" + (x%y));
        System.out.println("y%x=" + (y%x));
    }
}
