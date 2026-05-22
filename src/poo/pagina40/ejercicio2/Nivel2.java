package poo.pagina40.ejercicio2;

import java.util.Scanner;

public class Nivel2 {

    private int puntajeNivel2 = 0;

    private final Scanner entrada = new Scanner(System.in);

    private final String[] preguntas = {

            "¿Cuál es el único mamífero capaz de volar?",

            "¿Qué animal es conocido como el rey de la selva?",

            "¿Cuántos tentáculos tiene un pulpo?",

            "¿Qué animal terrestre es el más rápido?"
    };

    private final String[] respuestasCorrectas = {

            "murcielago",

            "leon",

            "8",

            "guepardo"
    };

    public void jugarNivel2() {

        String resp;

        for (int i = 0; i < preguntas.length; i++) {

            System.out.println("\nPregunta " + (i + 1)
                    + ": " + preguntas[i]);

            resp = entrada.nextLine().trim();

            if (resp.equalsIgnoreCase(respuestasCorrectas[i])) {

                System.out.println("¡Correcto! +20 puntos.");

                puntajeNivel2 += 20;

            } else {

                System.out.println("¡Incorrecto! Era: "
                        + respuestasCorrectas[i]
                        + ". -10 puntos.");

                puntajeNivel2 -= 10;
            }
        }
    }

    public int getPuntajeNivel2() {

        return puntajeNivel2;
    }
}