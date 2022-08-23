package Figuras;

/**
 *
 * @author kevin
 */
public class TrianguloRectangulo {
    int base; // Atributo que define la base de un triangulo rectangulo
    int altura; // Atributo que define la altura de un triangulo rectangulo

    /*
     * Constructor de la clase TrianguloRectangulo
     * 
     * @param base Parametro que define la base de un triangulo rectangulo
     * 
     * @param altura Parametro que define la altura de un triangulo rectangulo
     */

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /*
     * Metodo que calcula y devuelve el area de un triangulo rectangulo
     * como la base que multiplica la altura sobre 2
     * 
     * @return Area de un triangulo rectangulo
     */
    double calcularArea() {
        return (base * altura / 2);
    }
    /*
     * Metodo que calcula y devuelve el perimetro de un triangulo
     * rectangulo como la suma de la base, la altura y la hipotenusa
     * 
     * @return Perimetro de un triangulo rectangulo
     */

    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); // Se invoca al metodo calcular hipotenusa
    }

    /**
     * Metodo que calcula y devuelve la hipotenusa de un triangulo
     * rectangulo empleando el teorema de Pitagoras
     * 
     * @return Hipotenusa de un triangulo rectangulo
     */

    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    /**
     * Metodo que determina si un triángulo es:
     * Equilatero: si sus tres lados son iguales
     * Escaleno: si sus tres lados son todos diferentes
     * Isosceles: si dos de sus lados son iguales
     */

    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            System.out.println("Es un triangulo equilatero"); // Todos los lados son iguales
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triangulo escaleno"); // Todos son lados son diferentes
        else
            System.out.println("Es un triangulo isosceles"); // De otra forma, es isosceles

    }

}