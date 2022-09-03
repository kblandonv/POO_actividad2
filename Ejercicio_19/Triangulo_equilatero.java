package Ejercicio_19;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Triangulo_equilatero {

    public static void main(String[] args) {
        // TODO code application logic here
        double lado, altura, perimetro, area;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado");

        lado = entrada.nextDouble();
        perimetro = lado * 3;
        altura = ((Math.sqrt(3) * lado) / 2);
        area = (Math.pow(altura, 2) * Math.sqrt(3) / 3);

        System.out.println("****Triangulo equilatero****");

        System.out.println("El perimetro del triangulo equilatero es: " + Math.round(perimetro * 100d) / 100d);
        System.out.println("El valor de la altura es: " + Math.round(altura * 100d) / 100d);
        System.out.println("El area del triangulo equilatero es: " + Math.round(area * 100d) / 100d);
    }

}
