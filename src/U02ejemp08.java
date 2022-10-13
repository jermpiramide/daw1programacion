// Muestra los números de 320 al 160 contando de 20 en 20 hacia atrás. (utilizando while)



public class U02ejemp08 {
    public static void main(String args[]){

        int numero;

        numero = 320;

        while(numero>=160){
            System.out.println(numero);
            numero-=20;
        }
    }
}
