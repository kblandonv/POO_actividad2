package Ejercicio_15;

import java.util.*;

/**
 *
 * @author kevin
 */
public class Peso_Esfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double esfera_a, esfera_b, esfera_c, esfera_d;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A");
        esfera_a = entrada.nextDouble();

        System.out.println("Ingrese el peso de la esfera B");
        esfera_b = entrada.nextDouble();

        System.out.println("Ingrese el peso de la esfera C");
        esfera_c = entrada.nextDouble();

        System.out.println("Ingrese el peso de la esfera D");
        esfera_d = entrada.nextDouble();

        if ((esfera_a == esfera_b) && (esfera_a == esfera_c)) {
            if (esfera_d > esfera_a) {
                System.out.println("La esfera D es la diferente");
                System.out.println("Y es de mayor peso");
            } else {
                System.out.println("La esfera D es la diferente");
                System.out.println("Y es de menor peso");
            }
        } else if ((esfera_a == esfera_b) && (esfera_a == esfera_d)) {
            System.out.println("La esfera C es la diferente");
            if (esfera_c > esfera_a) {
                System.out.println("Y es de mayor peso");

            } else {
                System.out.println("Y es de menor peso");
            }
        } else if ((esfera_a == esfera_c) && (esfera_a == esfera_d)) {
            System.out.println("La esfera B es la diferente");
            if (esfera_b > esfera_d) {
                System.out.println("Y es de mayor peso");

            } else {
                System.out.println("Y es de menor peso");
            }
        } else {
            System.out.println("La esfera A es la diferente");
            if (esfera_a > esfera_b) {
                System.out.println("Y es de mayor peso");

            } else {
                System.out.println("Y es de menor peso");
            }
        }
    }
}