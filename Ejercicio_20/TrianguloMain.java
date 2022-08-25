package Ejercicio_20;

import javax.swing.*;

/**
 *
 * @author kevin
 */
public class TrianguloMain {

    public static void main(String[] args) {
        // TODO code application logic here

        // Se crea un objeto de la clase Triangulo (Instanciaciación)
        Triangulo ObjTriangulo = new Triangulo();
        double lado_1, lado_2, lado_3;// se definen 3 variable de tipo double "lado_1", "lado_2" y "lado_3"

        // Se pide el primer lado y se guarda en lado_1;
        lado_1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite lado 1"));
        ObjTriangulo.setLado1(lado_1);// se llama al metodo modificador de lado 1 y se encapsula "lado_1"

        // Se pide el primer lado y se guarda en lado_2;
        lado_2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite lado 2"));
        ObjTriangulo.setLado2(lado_2);// se llama al metodo modificador de lado 2 y se encapsula "lado_2"

        // Se pide el primer lado y se guarda en lado_3;
        lado_3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite lado 3"));
        ObjTriangulo.setLado3(lado_3);// se llama al metodo modificador de lado 3 y se encapsula "lado_3"

        // Se imprime en pantalla el perimetro
        System.out.println("El perimetro es: " + ObjTriangulo.perimetro());

        // Se imprime en pantalla el semiperimetro
        System.out.println("El semiperimetro es: " + ObjTriangulo.semiperimetro());

        // Se imprime en pantalla el area
        System.out.println("El area es: " + ObjTriangulo.area());

    }

}