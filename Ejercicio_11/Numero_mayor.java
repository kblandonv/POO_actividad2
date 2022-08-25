package Ejercicio_11;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Numero_mayor {

    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;

        System.out.println("*** El numero mayor entre 3 numeros A, B y C ***");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero A");
        a = entrada.nextInt();

        System.out.println("Ingrese un numero B");
        b = entrada.nextInt();

        System.out.println("Ingrese un numero C");
        c = entrada.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("El mayor es: " + a);
            } else {
                System.out.println("el mayor es: " + c);
            }
        } else if (b > c) {
            System.out.println("el mayor es: " + b);
        } else {
            System.out.println("el mayor es: " + c);
        }

    }
}
