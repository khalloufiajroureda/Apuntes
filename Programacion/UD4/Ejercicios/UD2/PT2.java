package Ejercicios.UD2;

import java.util.Scanner;
import java.util.ArrayList;

public class PT2 {
    public static void main(String[] args) {
        final String DIENTE = "X", DIENTESANO = "SI", DIENTEDANIADO = "NO";
        final int NUMDIENTES = 10, MAXDIENTESPICADOS = 5;

        final int DIENTESPICADOS = (int) (Math.random() * MAXDIENTESPICADOS) + 1;
        final int DIENTESNOPICADOS = NUMDIENTES - DIENTESPICADOS;
        Scanner Scanner = new Scanner(System.in);

        final String JUGADOR1 = "Jugador 1", JUGADOR2 = "Jugador 2";
        boolean jugadorPerdido = false;
        String jugadorActual = JUGADOR1;
        String mensajeFinPrograma = "Enhorabuena, ambos ganan";
        int posicionSeleccionada = 0;
        int dientesPicdadosIntroducidos = 0;
        int posicionDienteIntroducir = 0;

        
        ArrayList <Integer> tableroInterno = new ArrayList<Integer>();
        new ArrayList<Integer>();
        ArrayList <String> tableroVisible = new ArrayList<String>();
        new ArrayList<String>();

        for (int i = 0; i < NUMDIENTES; i++) {
            tableroInterno.add(0);
        }
        

        while (dientesPicdadosIntroducidos < DIENTESPICADOS) {
            posicionDienteIntroducir = (int) (Math.random() * NUMDIENTES);
            if (tableroInterno.get(posicionDienteIntroducir).equals(0)) {
                tableroInterno.get(posicionDienteIntroducir).equals(1);
                dientesPicdadosIntroducidos++;
            }
        }

        for (int i = 0; i < NUMDIENTES; i++) {
            tableroVisible.add(DIENTE);
        }

        for (int i = 0; i < DIENTESNOPICADOS && !jugadorPerdido; i++) {
            do {
                System.out.print(jugadorActual + " elige: ");
                posicionSeleccionada = Scanner.nextInt();
            } while (tableroVisible.get(posicionSeleccionada) != DIENTE || (posicionSeleccionada < 0 || posicionSeleccionada > NUMDIENTES || Float.isNaN(posicionSeleccionada)));

            if (tableroInterno.get(posicionSeleccionada) == 0 ) {
                tableroVisible.set(posicionSeleccionada, DIENTESANO);
            } else {
                tableroVisible.set(posicionSeleccionada, DIENTEDANIADO);
                mensajeFinPrograma = "¡El cocodrilo mordió! " + jugadorActual + " pierde.";
                jugadorPerdido = true;
            }
            System.out.println(tableroVisible);

            if (jugadorActual.equals(JUGADOR1)) {
                jugadorActual = JUGADOR2;
            }else {
                jugadorActual = JUGADOR1;
            }
        }
        System.out.println(mensajeFinPrograma);
        Scanner.close();
    }
}
