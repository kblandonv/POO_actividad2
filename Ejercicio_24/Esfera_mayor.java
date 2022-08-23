package Ejercicio_24;

import java.util.*;

/**
 *
 * @author kevin
 */
public class Esfera_mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double esfera_a, esfera_b, esfera_c;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de la esfera a");
        esfera_a = entrada.nextDouble();

        System.out.println("Ingrese el valor de la esfera b");
        esfera_b = entrada.nextDouble();

        System.out.println("Ingrese el valor de la esfera c");
        esfera_c = entrada.nextDouble();

        if ((esfera_a > esfera_b) && (esfera_a > esfera_c)) {
            System.out.println("La esfera A es mayor, con un peso de: " + esfera_a);
        } else if ((esfera_b > esfera_a) && (esfera_b > esfera_c)) {
            System.out.println("La esfera B es mayor, con un peso de: " + esfera_b);
        } else if ((esfera_c > esfera_b) && (esfera_c > esfera_a)) {
            System.out.println("La esfera C es mayor, con un peso de: " + esfera_c);

        } else {
            System.out.println("Las esferas no tienen diferente peso");

        }

    }

}