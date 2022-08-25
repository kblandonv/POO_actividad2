package Figuras;

/**
 *
 * @author kevin
 */
public class Rombo {
    int lado; // Atributo que define el lado de un rombo
    int diagonal_mayor; // Atributo que define la diagonal mayor de un rombo
    int diagonal_menor; // Atributo que define la diagonal menor de un rombo

    /*
     * Constructor de la clase Rombo
     * 
     * @param lado Parametro que define el lado de un rombo
     * 
     * @param diagonal_mayor Parametro que define la diagonal mayor de un rombo
     * 
     * @param diagonal_menor Parametro que define la diagonal menor de un rombo
     */

    public Rombo(int lado, int diagonal_mayor, int diagonal_menor) {
        this.lado = lado;
        this.diagonal_mayor = diagonal_mayor;
        this.diagonal_menor = diagonal_menor;
    }
    
    /*
     * Metodo que calcula y devuelve el area de un rombo como la
     * multiplicacion de su diagonal mayor por su diagonal menor sobre 2
     * 
     * @return Area de un rombo
     */

    double calcularArea(){
        return (diagonal_mayor*diagonal_menor)/2;
    }

    /*
     * Metodo que calcula y devuelve el perimetro de un rombo
     * como la multiplicacion de su lado por 4
     * 
     * @return Perimetro de un rombo
     */

    double calcularPerimetro(){
        return lado*4;
    }

}