package poo.pagina40.ejercicio2;

public class Main {

    public static void main(String[] args) {

        int puntajeTotal = 0;

        System.out.println(" BIENVENIDO AL JUEGO DE LOS ANIMALES ");

        System.out.println("\n INICIANDO NIVEL 1 ");

        Nivel1 n1 = new Nivel1();

        n1.imprimePreguntas();

        int puntosN1 = n1.getPuntaje();

        System.out.println("MARCADOR");
        System.out.println("Nivel 1");
        System.out.println("Tu puntaje es: " + puntosN1);

        puntajeTotal += puntosN1;

        System.out.println("\n INICIANDO NIVEL 2 ");

        Nivel2 n2 = new Nivel2();

        n2.jugarNivel2();

        int puntosN2 = n2.getPuntajeNivel2();

        System.out.println("MARCADOR");
        System.out.println("Nivel 2");
        System.out.println("Tu puntaje en este nivel es: " + puntosN2);

        puntajeTotal += puntosN2;

        System.out.println("\n");
        System.out.println("PUNTAJE FINAL ACUMULADO DE LOS DOS NIVELES: "
                + puntajeTotal + " puntos.");
    }
}