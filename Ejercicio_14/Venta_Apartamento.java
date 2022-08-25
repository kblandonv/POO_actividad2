package Ejercicio_14;

import java.util.*;

/**
 *
 * @author kevin
 */
public class Venta_Apartamento {
    public static void main(String[] args) {
        int ventas_departamento_1;
        int ventas_departamento_2;
        int ventas_departamento_3;
        double salario, total_ventas, porcentaje_ventas;
        double salario_vendedor1, salario_vendedor2, salario_vendedor3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el importe de las ventas del departamento 1");
        ventas_departamento_1 = entrada.nextInt();

        System.out.println("Ingrese el importe de las ventas del apartamento 2");
        ventas_departamento_2 = entrada.nextInt();

        System.out.println("Ingrese el importe de las ventas del apartamento 3");
        ventas_departamento_3 = entrada.nextInt();

        System.out.println("Ingrese el salario que reciben los vendedores");
        salario = entrada.nextDouble();

        total_ventas = (ventas_departamento_1 + ventas_departamento_2 + ventas_departamento_3);
        porcentaje_ventas = (0.33 * total_ventas);

        if (ventas_departamento_1 > porcentaje_ventas) {
            salario_vendedor1 = salario + 0.2 * salario;

        } else {
            salario_vendedor1 = salario;
        }
        if (ventas_departamento_2 > porcentaje_ventas) {
            salario_vendedor2 = salario + 0.2 * salario;

        } else {
            salario_vendedor2 = salario;
        }

        if (ventas_departamento_3 > porcentaje_ventas) {
            salario_vendedor3 = salario + 0.2 * salario;

        } else {
            salario_vendedor3 = salario;
        }

        System.out.println("SALARIO VENDEDORES DEPTO. 1: " + salario_vendedor1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2: " + salario_vendedor2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3: " + salario_vendedor3);

    }
}