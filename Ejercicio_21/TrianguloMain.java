package Ejercicio_21;

import java.util.*;

/**
 *
 * @author kevin
 */
public class TrianguloMain {

    public static void main(String[] args) {
        // TODO code application logic here

        double a, b, c, perimetro, semiperimetro, area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer lado: ");
        a = entrada.nextDouble();

        System.out.println("Ingrese el valor del segundo lado: ");
        b = entrada.nextDouble();

        System.out.println("Ingrese el valor del tercer lado");
        c = entrada.nextDouble();

        perimetro = a + b + c;

        System.out.println("El perimetro es: " + perimetro);

        semiperimetro = (a + b + c) / 2;

        System.out.println("El semiperimetro es: " + semiperimetro);
        area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));

        System.out.println("El area es: " + Math.round(area * 100d) / 100d);

    }
}