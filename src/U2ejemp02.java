// Escribe un programa que calcule el salario semanal de un trabajador
// teniendo en cuenta que las horas ordinarias (40 primeras) se pagan a 12 € la hora.
// A partir de la hora 41 se pagan a 16 € la hora.

public class U2ejemp02 {
    public static void main(String args[]){

        int horas, salario;
        final int preciohora1, preciohora2;

        preciohora1 = 10;
        preciohora2 = 17;
        horas = 41;

        if(horas <= 40){
            salario = horas*preciohora1;
        } else{
            salario = 40*preciohora1+(horas-40)*preciohora2;
        }
        System.out.println("Salario: " + salario + " €.");
    }
}
