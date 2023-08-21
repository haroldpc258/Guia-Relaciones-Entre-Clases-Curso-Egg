package servicios;

import entidades.Perro;
import entidades.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaService {

    public List<Persona> crearPersonasEjemplo() {

        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            personas.add(new Persona(("Persona " + (i + 1)), ("Apellido " + (i + 1)), (int) (Math.random() * 40) + 10, (int) (Math.random() * 1000000)));
        }

        return personas;
    }

    public void adoptarPerro(Persona persona, List<Perro> perros, String nombreToAdoptar) {

        for (Perro perro : perros) {
            if (perro.getNombre().equalsIgnoreCase(nombreToAdoptar)) {
                if (perro.getDuenio() == null) {
                    perro.setDuenio(persona);
                    persona.getMascotas().add(perro);
                } else {
                    System.out.println("\nLo siento, el perro" + perro.getNombre() + " ya está adoptado.");
                }
                return;
            }
        }

        System.out.println("\nLo siento, el nombre no coincide con ninguno de nuestro canes");
    }

    public void mostrarPersonas(List<Persona> personas) {

        System.out.println("\nLISTA DE PERSONAS.");
        int indice = 1;
        for (Persona persona : personas) {
            System.out.println(indice + " " + persona);
            indice++;
        }
    }
}
