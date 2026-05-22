package poo.pagina47.ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 2: Abstracción de Clases ===");


        Personal trabajador = new Empleado("Raúl Alexander", "Analista de Sistemas", 22.50, 44);


        trabajador.Registrar();
        trabajador.calcularSueldo();
    }
}
