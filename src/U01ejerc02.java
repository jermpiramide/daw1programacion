/*
2. ¿Cuál de los siguientes identificadores no es válido?. Escribe un programa indicando entre comentarios la respuesta.

casa    mi-casa    mi*casa    micasa1

_MES    MES_1    MES%UNO    mes$1

a980    890a        _año90    $a890
 */
public class U01ejerc02 {
    public static void main(String arg[]){
        //String casa, mi-casa, mi*casa, micasa1;
        String casa, micasa1;

        //String _MES, MES_1, MES%UNO, mes$1;
        String _MES, MES_1, mes$1;

        //String a980, 890a, _año90, $a890;
        String a980, _año90, $a890;

       //String mi-casa, mi*casa, MES%UNO, 890a;

        System.out.println("Los identificaores mi-casa, mi*casa, MES%UNO, 890a no son válidos.");
    }
}
