package Figuras;

/**
 *
 * @author kevin
 */
public class Trapecio {
    int lado; // Atributo que define el lado de un trapecio
    int altura; // Atributo que define la altura de un trapecio
    int base_mayor; // Atributo que define la base mayor de un trapecio
    int base_menor; // Atributo que define la base menor de un trapecio

    /*
     * Constructor de la clase Trapecio
     * 
     * @param lado Parametro que define el lado de un trapecio
     * 
     * @param altura Parametro que define la altura de un trapecio
     * 
     * @param base_mayor Parametro que define la base mayor de un trapecio
     * 
     * @param base_menor Parametro que define la base menor de un trapecio
     */

    public Trapecio(int lado, int altura, int base_mayor, int base_menor) {
        this.lado = lado;
        this.altura = altura;
        this.base_mayor = base_mayor;
        this.base_menor = base_menor;
    }

    /*
     * Metodo que calcula y devuelve el area de un trapecio como la
     * suma de su base mayor con la base menor sobre 2
     * multiplicado por la altura
     * 
     * @return Area de un trapecio
     */
    double calcularArea() {
        return ((base_mayor + base_menor) / 2) * altura;
    }

    /*
     * Metodo que calcula y devuelve el perimetro de un trapecio
     * como la suma de la base mayor mas la base menor
     * sumado a la multiplicacion de su lado por 2
     * 
     * @return Perimetro de un trapecio
     */

    double calcularPerimetro() {
        return ((base_mayor + base_menor) + lado * 2);
    }

}