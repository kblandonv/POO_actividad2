package Ejercicio_22;

import java.util.*;

/**
 *
 * @author kevin
 */
public class Salario_Mensual {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        double salario_hora, salario_bruto;
        int horas;

        Scanner entrada = new Scanner(System.in);

        System.out.println("**** Datos del empleado ****");

        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el salario por hora");
        salario_hora = entrada.nextDouble();

        System.out.println("Ingrese las horas trabajadas");
        horas = entrada.nextInt();

        salario_bruto = horas * salario_hora;

        if (salario_bruto > 450000) {
            System.out.println("El salario de " + nombre + " $ es de: " + String.format("%.1f", salario_bruto));

        } else {
            System.out.println("El nombre del empleado es " + nombre);
        }

    }

}