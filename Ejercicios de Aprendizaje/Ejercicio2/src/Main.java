import ejercicio1.entidades.Juego;
import ejercicio1.entidades.Jugador;
import ejercicio1.entidades.Revolver;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Revolver revolver = new Revolver();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Juego nuevoJuego = new Juego();

        System.out.println("\nBienvenido!");

        System.out.print("Ingrese el número de jugadores que van a participar: ");
        int numeroJugadores = scanner.nextInt();

        numeroJugadores = Math.min(numeroJugadores, 6);

        for (int i = 1; i <= numeroJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        nuevoJuego.empezarJuego(jugadores, revolver);
        nuevoJuego.ronda();
    }
}