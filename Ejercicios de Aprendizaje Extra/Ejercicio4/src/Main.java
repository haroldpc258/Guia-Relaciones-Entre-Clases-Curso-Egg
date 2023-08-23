import entidades.Alumno;
import entidades.Simulacion;
import entidades.Voto;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Simulacion simulacion1 = new Simulacion();

        int numeroAlumnos = 20;
        int numeroVotos = 3;
        int numeroFacilitadores = 5;

        List<Alumno> alumnos = simulacion1.crearAlumnos(simulacion1.generarNombresAlumnos(numeroAlumnos), simulacion1.generarDniAlumnos(numeroAlumnos));

        simulacion1.mostrarAlumnos(alumnos);

        List<Voto> votos = simulacion1.votacion(alumnos, numeroVotos);

        simulacion1.mostrarVotos(votos);

        simulacion1.recuentoVotos(alumnos);

        List<Alumno>[] facilitadores = simulacion1.crearFacilitadores(alumnos, numeroFacilitadores);

        System.out.println("\nFACILITADORES TITULARES.");
        simulacion1.mostrarAlumnos(facilitadores[0]);

        System.out.println("\nFACILITADORES SUPLENTES.");
        simulacion1.mostrarAlumnos(facilitadores[1]);
    }
}