package Figuras;

/**
 *
 * @author kevin
 */

/*
 * Esta clase prueba diferentes acciones realizadas en diversas
 * figuras geometricas
 */

public class TestFiguras {

    /*
     * Metodo main que crea un circulo, un rectangulo, un cuadrado,
     * un triangulo rectangulo, un rombo y un trapecio.
     * Para cada uno de estas figuras geometricas se calcula su area
     * y su perimetro
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        Rombo figura5 = new Rombo(10, 16, 12);
        Trapecio figura6 = new Trapecio(5, 4, 8, 6);

        System.out.println("El area del circulo es: " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es: " + figura1.calcularPerimetro());

        System.out.println("El area del rectangulo es: " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + figura2.calularPerimetro());

        System.out.println("El area del cuadrado es: " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + figura3.calcularPerimetro());

        System.out.println("El area del triangulo es: " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es: " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();

        System.out.println("El area del rombo es: "+figura5.calcularArea());
        System.out.println("El perimetro del rombo es: "+figura5.calcularPerimetro());

        System.out.println("El area del trapecio es: "+figura6.calcularArea());
        System.out.println("El perimetro del trapecio es: "+figura6.calcularPerimetro());

    }

}