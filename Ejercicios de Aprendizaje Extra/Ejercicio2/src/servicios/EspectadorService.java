package servicios;

import entidades.Espectador;

import java.util.ArrayList;

public class EspectadorService {

    public ArrayList<Espectador> crearEspectadoresEjemplo() {

        ArrayList<Espectador> espectadores = new ArrayList<>();

        for (int i = 0; i < 70; i++) {

            espectadores.add(new Espectador(("Espectador " + (i + 1)), (int) (Math.random() * 40) + 10, Math.random() * 100));
        }

        return espectadores;
    }
}
