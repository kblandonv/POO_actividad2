package Ejercicio_23;

import java.util.*;

/**
 *
 * @author kevin
 */
public class Ecuacion {

    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, x1, x2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de a");
        a = entrada.nextDouble();

        System.out.println("Ingrese el valor de b");
        b = entrada.nextDouble();

        System.out.println("Ingrese el valor de c");
        c = entrada.nextDouble();

        /*
         * una forma de obtener las posibles soluciones es mediante la ecuacion
         * cuadratica, esta ecuacion arroja como dos resultados
         * la estructura de la ecuacion de segundo grado es
         * ax^2 + bx + c
         */

        if (a != 0) {
            if ((b * b) - (4 * a * c) >= 0) {
                x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
                x2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
                System.out.println("Solucion 1: " + x1 + "\n Solucion 2: " + x2);

            } else {
                System.out.println("Son raices complejas, por favor ingresar nuevos valores para a, b y c");
            }

        } else {
            System.out.println("La unica solucion es: " + -c / b);
        }
    }

}