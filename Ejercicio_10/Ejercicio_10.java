package Ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int estrato, Numero_Inscripcion;
        double pago, patrimonio;

        System.out.println("***** Liquidación Matrícula ******");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero de inscripción");
        Numero_Inscripcion = entrada.nextInt();

        System.out.println("Ingrese el nombre del estudiante");
        nombre = entrada.next();

        System.out.println("Ingrese su patrimonio");
        patrimonio = entrada.nextDouble();

        System.out.println("Ingrese su estrato");
        estrato = entrada.nextInt();

        pago = 50000;

        if (patrimonio > 2000000 && estrato > 3) {
            pago = pago + (0.03 * patrimonio);
        }

        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION: " + Numero_Inscripcion + " Y NOMBRE: " + nombre
                + " \nDEBE PAGAR: " + pago);

    }

}