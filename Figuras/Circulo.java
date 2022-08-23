/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author kevin
 */
public class Circulo {

    int radio; // Atributo que define el radio del circulo

    /**
     * Constructor de la clase Circulo
     *
     * @param radio Parametro que define el radio del circulo
     */
    public Circulo(int radio) {
        this.radio = radio;
    }

    /*
     * Metodo que calcula y devuelve el area de un circulo
     * en funcion de su radio
     * 
     * @return Area de un circulo
     */

    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /*
     * Metodo que calcula y devuelve el perimetro de un circulo
     * como la multiplicacion de pi por el radio por 2
     * 
     * @return Perimetro de un circulo
     */

    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}