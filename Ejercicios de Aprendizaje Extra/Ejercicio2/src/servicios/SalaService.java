package servicios;

import entidades.Espectador;
import entidades.Sala;
import entidades.Silla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SalaService {


    public void crearSillas(Sala sala) {

        for (int i = sala.getSillas().length - 1; i >= 0; i--) {
            for (int j = 0; j < sala.getSillas()[0].length; j++) {
                sala.getSillas()[i][j] = new Silla(i + 1, j);
            }
        }
    }

    public void llenarEjemplo(Sala sala, EspectadorService es) {

        ArrayList<Espectador> espectadores = es.crearEspectadoresEjemplo();

        for (int i = 0; i < espectadores.size() ; i++) {
            if (!asignarSillaAleatoria(sala, espectadores.get(i))) {
                i--;
            }
        }
    }

    public boolean asignarSillaAleatoria(Sala sala, Espectador espectador) {

        Silla[][] sillas = sala.getSillas();
        int fila = (int) (Math.random()*sillas.length);
        int columna = (int) (Math.random()*sillas[0].length);
        Silla sillaOcupar = sillas[fila][columna];

        if (isLLena(sala)) {
            if (espectador.getDineroDisponible() >= sala.getPrecioEntrada()) {
                if (espectador.getEdad() >= sala.getPeliReproduciendo().getEdadMinima()) {
                    if (!sillaOcupar.isOcupada()) {
                        sillaOcupar.setOcupada(true);
                        sillaOcupar.setEspectador(espectador);
                        System.out.println("\nSe ha asignado la silla: " + sillaOcupar.getFila() + " " +
                                sillaOcupar.getColumna() + ", al espectador: " + espectador.getNombre());
                    } else {
                        System.out.println("\nLo siento, esta silla ya está reservada.");
                        return false;
                    }
                } else {
                    System.out.println("\nLo siento, no tiene la edad mínima para ver esta película.");
                    System.out.println(espectador);
                }
            } else {
                System.out.println("\nLo siento, no posee el dinero suficiente para pagar la entrada.");
                System.out.println(espectador);
            }
        } else {
            System.out.println("\nLo siento, la sala ya se encuentra llena.");
        }

        return true;
    }

    public boolean isLLena(Sala sala) {
        return Arrays.stream(sala.getSillas()).anyMatch(filas -> Arrays.stream(filas).anyMatch(s -> !s.isOcupada()));
    }

    public void asignarPelicula(Sala sala, PeliculaService ps, Scanner scanner) {

        sala.setPeliReproduciendo(ps.crearPelicula(scanner));
    }

    public void asignarPrecioEntrada(Sala sala, Scanner scanner) {

        System.out.println("\nPRECIO DE ENTRADA...");
        System.out.print("Ingrese el valor de la entrada para esta sala: ");
        sala.setPrecioEntrada(scanner.nextDouble());
    }

    public void mostrarSillas(Sala sala) {

        for (int i = sala.getSillas().length - 1; i >= 0; i--) {
            for (int j = 0; j < sala.getSillas()[0].length; j++) {
                Silla sillaActual = sala.getSillas()[i][j];
                System.out.print(" | " + sillaActual.getFila() + " " + sillaActual.getColumna() + (sillaActual.isOcupada() ? " X" : "  "));
            }
            System.out.println();
        }
    }

}
