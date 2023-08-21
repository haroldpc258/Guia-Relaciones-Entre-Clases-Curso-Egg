import entidades.Perro;
import entidades.Persona;
import servicios.PerroService;
import servicios.PersonaService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PerroService perroServ = new PerroService();
        PersonaService personaServ = new PersonaService();

        List<Perro> perros = perroServ.crearPerrosEjemplo();
        List<Persona> personas = personaServ.crearPersonasEjemplo();

        for (Persona persona : personas) {
            personaServ.adoptarPerro(persona, perros, perros.get((int) (Math.random() * perros.size())).getNombre());
        }

        personaServ.mostrarPersonas(personas);
    }
}