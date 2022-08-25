package Ejercicio_13;

import java.util.*;

/**
 *
 * @author kevin
 */

public class Descuento {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int bolita;
        double cantidad_a_pagar, descuento, valor_de_la_compra;
        Random rand = new Random();
        System.out.print("Ingresa el valor de la compra: ");
        valor_de_la_compra = entrada.nextDouble();
        entrada.nextLine();
        descuento = 0;
        bolita = rand.nextInt(5);
        if (bolita == 0)
            System.out.println("Bolita blanca.");
        if (bolita == 1) {
            descuento = valor_de_la_compra * 0.1;
            System.out.println("Bolita verde.");
        }
        if (bolita == 2) {
            descuento = valor_de_la_compra * 0.25;
            System.out.println("Bolita amarilla.");
        }
        if (bolita == 3) {
            descuento = valor_de_la_compra * 0.5;
            System.out.println("Bolita azul.");
        }
        if (bolita == 4) {
            descuento = valor_de_la_compra;
            System.out.println("Bolita roja.");
        }
        cantidad_a_pagar = valor_de_la_compra - descuento;
        System.out.println("El cliente debe pagar: " + cantidad_a_pagar);
    }

}