package poo.pagina43.ejercicio1;

public class Main {

    public static void main(String[] args) {
        System.out.println(" SELECCIÓN NACIONAL (PILAR DE HERENCIA) ");


        Futbolista jugador = new Futbolista(10, "Jorge", "González", 24, 10, "Delantero Centro");
        Entrenador dt = new Entrenador(1, "Juan", "Diaz", 42, "FEDE-992-M");
        Masajista masajista = new Masajista(5, "Camila", "Ceren", 31, "Lic. Fisioterapia", 8);

        System.out.println("\n ACCIONES HEREDADAS DE LA SUPERCLASE ");
        jugador.concentrarse();
        dt.viajar();
        masajista.concentrarse();

        System.out.println("\n ACCIONES PROPIAS DE CADA CLASE HIJA ");
        jugador.jugarPartido();
        dt.dirigirPartido();
        masajista.darMasaje();
    }
}