package ejercicio1.entidades;

import java.util.ArrayList;

public class Juego {

    private Revolver revolver;
    private ArrayList<Jugador> jugadores;

    public void empezarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {

        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {

        revolver.cargar();

        while (true) {
            for (Jugador jugador :jugadores) {
                System.out.println(revolver.toString());

                if (jugador.disparo(revolver)) {
                    System.out.println("\nPUUUUMMMMMMMMM!!!");
                    System.out.println(jugador.getNombre() + " ha muerto!!!");
                    return;
                }
            }
        }
    }
}
