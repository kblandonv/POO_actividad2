package Ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Mayor_Menor_Igual {

    public static void main(String[] args) {
        // TODO code application logic here

        int a, b;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de la varibale a");
        a = entrada.nextInt();

        System.out.println("Ingrese el valor de la variable b");
        b = entrada.nextInt();

        if (a > b) {
            System.out.println("A es mayor que B " + a + " " + b);

        } else if (a == b) {
            System.out.println("A es igual a B " + a + " " + b);

        } else {
            System.out.println("A es menor que B " + a + " " + b);
        }
    }

}