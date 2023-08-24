import entidades.Cine;
import servicios.CineService;
import servicios.EspectadorService;
import servicios.PeliculaService;
import servicios.SalaService;

public class Ejercicio2 {
    public static void main(String[] args) {


        CineService cs = new CineService();
        SalaService ss = new SalaService();
        EspectadorService es = new EspectadorService();
        PeliculaService ps = new PeliculaService();


        Cine cine1 = cs.crearCine("CINE CHIQUITO");

        cs.agregarSala(cine1, ss);

        cs.asignarPeliculaSala(cine1, ss, ps);

        cs.asignarPrecioSala(cine1, ss);

        int numeroEspectadores = 50;
        cs.llenarSalaEspectadores(cine1, ss, es, numeroEspectadores);

        cs.mostrarSala(cine1, ss, 1);
    }
}