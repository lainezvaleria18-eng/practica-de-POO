package poo.pagina43.ejercicio1;

public class Main {

    public static void main(String[] args) {

        System.out.println("SELECCIÓN NACIONAL");
        System.out.println("PILAR HERENCIA");

        Futbolista jugador =
                new Futbolista(
                        10,
                        "Jorge",
                        "Gonzalez",
                        24,
                        9,
                        "Delantero"
                );

        Entrenador entrenador =
                new Entrenador(
                        1,
                        "Juan",
                        "Diaz",
                        42,
                        "FEDE-992"
                );

        Masajista masajista =
                new Masajista(
                        5,
                        "Camila",
                        "Ceren",
                        31,
                        "Fisioterapia",
                        8
                );

        System.out.println("\nACCIONES HEREDADAS");

        jugador.concentrarse();

        entrenador.viajar();

        masajista.concentrarse();

        System.out.println("\nACCIONES PROPIAS");

        jugador.jugarPartido();

        entrenador.dirigirPartido();

        masajista.darMasaje();
    }
}