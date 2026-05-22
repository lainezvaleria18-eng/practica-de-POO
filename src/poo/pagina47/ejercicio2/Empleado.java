package poo.pagina47.ejercicio2;

public class Empleado extends Personal {
    private double pagoPorHora;
    private int horasTrabajadas;


    public Empleado(String nombre, String puesto, double pagoPorHora, int horasTrabajadas) {
        super(nombre, puesto); // Envía los datos al constructor de Personal
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }


    @Override
    public void Registrar() {
        System.out.println("💼 [REGISTRO] Se ha registrado al empleado " + getNombre() + " exitosamente como: " + getPuesto());
    }


    @Override
    public void calcularSueldo() {
        double sueldoTotal = pagoPorHora * horasTrabajadas;
        System.out.println("💰 [SUELDO] El sueldo devengado por " + getNombre() + " es de: $" + sueldoTotal);
    }
}