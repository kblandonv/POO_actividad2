package Ejercicio_18;

/**
 * @authors
 *
 */
public class Empleado {

    String codigo = "003KB", nombre = "Kevin Blandon";
    int horas_mes = 48;
    double valor_hora = 5000;
    double retencion = 0.125;
    double salario_bruto = horas_mes * valor_hora;
    double retencion_valor = salario_bruto * retencion;
    double salario_neto = salario_bruto - retencion_valor;

    public Empleado() {
        System.out.println("****Informacion del empleado****");
        System.out.println("\n Codigo: " + codigo + "\n Nombre: " + nombre + "\n Salario Bruto: " + salario_bruto
                + "\n Salario Neto: " + salario_neto);

    }
}