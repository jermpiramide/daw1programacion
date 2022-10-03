//Realiza un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA).
// La base imponible estará almacenada en una variable. El IVA estará en una constante.

public class U01ejemp05 {
    public static void main(String args[]){
        final double IVA = 21;
        final int IVAENTERO = 21;
        double baseimponible = 100;
        double totalfactura = baseimponible*(1+(IVA/100));

        System.out.println("Total factura: " + totalfactura);
        System.out.println("Total factura (forzadondo a double la variable entera 'IVAENTERO'): " + (baseimponible*(1+((1.0*IVAENTERO)/100))));
    }
}
