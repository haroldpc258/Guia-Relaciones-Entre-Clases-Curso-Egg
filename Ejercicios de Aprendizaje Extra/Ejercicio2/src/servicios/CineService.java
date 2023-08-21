package servicios;

import entidades.Cine;
import entidades.Sala;

import java.util.Scanner;

public class CineService {


    Scanner scanner;

    public CineService() {
        scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public Cine crearCine(String nombre) {

        return new Cine(nombre);
    }

    public void agregarSala(Cine cine, SalaService ss) {

        int numeroSala = cine.getSalas().size();
        cine.getSalas().add(new Sala(numeroSala + 1));
        ss.crearSillas(cine.getSalas().get(numeroSala));
    }

    public void llenarSalaEspectadores(Cine cine, SalaService ss, EspectadorService es) {

        int numeroSala = cine.getSalas().size() - 1;
        ss.llenarEjemplo(cine.getSalas().get(numeroSala), es);
    }

    public void asignarPeliculaSala(Cine cine, SalaService ss, PeliculaService ps) {

        int numeroSala = cine.getSalas().size() - 1;
        ss.asignarPelicula(cine.getSalas().get(numeroSala), ps, scanner);
    }

    public void asignarPrecioSala(Cine cine, SalaService ss) {

        int numeroSala = cine.getSalas().size() - 1;
        ss.asignarPrecioEntrada(cine.getSalas().get(numeroSala), scanner);
    }

    public void mostrarSala(Cine cine, SalaService ss, int numeroSala) {

        System.out.println("\nMOSTRANDO SALA...");
        numeroSala--;

        System.out.println(cine.getSalas().get(numeroSala));
        ss.mostrarSillas(cine.getSalas().get(numeroSala));
    }
}
