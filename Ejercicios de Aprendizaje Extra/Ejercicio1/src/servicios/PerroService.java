package servicios;

import entidades.Perro;
import entidades.Persona;

import java.util.ArrayList;
import java.util.List;

public class PerroService {

    public List<Perro> crearPerrosEjemplo() {

        List<Perro> perros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            perros.add(new Perro(("Chiquito " + (i + 1)), ("Chihuahua " + (i + 1)), (int) (Math.random() * 14) + 1, (int) (Math.random() * 50) + 20));
        }

        return perros;
    }
}
