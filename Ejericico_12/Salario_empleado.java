package Ejericico_12;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Salario_empleado {

    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        int horas, pago_doble = 0, pago_triple;
        double sueldo, pago;

        System.out.println("***** SALARIO TRABAJADOR *****");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador");
        Nombre = entrada.next();

        System.out.println("Ingrese el numero de horas trabajadas");
        horas = entrada.nextInt();

        System.out.println("Ingrese el valor del pago por hora");
        pago = entrada.nextDouble();

        if (horas <= 40) {
            sueldo = horas * pago_doble;

        } else {
            if (horas <= 48) {
                pago_doble = horas - 40;
                sueldo = (40 * pago) + (pago_doble * pago * 2);
            } else {
                pago_triple = horas - 48;
                sueldo = (40 * pago) + (8 * pago * 2) + (pago_triple * pago * 3);
            }
        }

        System.out.println("El trabajador: " + Nombre + " devengo: " + String.format("%.1f", sueldo));

    }

}