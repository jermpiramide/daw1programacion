

public class U03ejempAleatorio {
    public static void main(String args[]){

        int numeroint;
        double numerodouble;

        for(int i=0; i<10000; i++){
            numerodouble = Math.random(); //Math.random() devuelve un número en el intervalo [0-1).
            System.out.println("nuerodouble: " + numerodouble);

            numerodouble = (numerodouble*10)+1; //Multiplicamos por 10 para que el intervalo [0-1) pase a ser [0-10)
            // y sumamos 1 para que el intervalo [0-10) pase a ser [1-11).
            System.out.println("numerodoublex10+1: " + numerodouble);

            numeroint = (int) numerodouble; // Casteamos nuberodouble que es de tipo double para que sea de tipo int.
            System.out.println("numeroint: " + numeroint);

            if(numeroint<1 || numeroint>10){
            // Imprime por pantalla numeroint si es menor que 1 o mayor que 10.
                System.out.println("numeroint es >1 o <10: " + numeroint);

                break;
            }
        }

        for(int i=0; i<10000; i++){
        //Este bucle hace lo mismo que el anterior, pero es más compacto.
            numeroint = (int) (Math.random()*10)+1;
            System.out.println("numero: " + numeroint);

            if(numeroint<1 || numeroint>10){
                System.out.println("numeroint del segundo bucle es >1 o <10: " + numeroint);

                break;
            }
        }
    }

}
