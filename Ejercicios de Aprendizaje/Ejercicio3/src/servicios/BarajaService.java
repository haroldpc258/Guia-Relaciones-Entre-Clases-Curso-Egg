package servicios;

import entidades.Baraja;
import entidades.Carta;
import enumeraciones.Palo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BarajaService {

    Baraja baraja;

    public Baraja crearBaraja() {

        baraja = new Baraja();

        for (int i = 0; i < Palo.values().length; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j != 8 && j != 9) {
                    baraja.getCartasBaraja().add(new Carta(j, Palo.values()[i]));
                }
            }
        }

        return baraja;
    }

    public Baraja barajar() {

        baraja.getCartasBaraja().addAll(baraja.getCartasMonton());
        Collections.shuffle(baraja.getCartasBaraja());

        return baraja;
    }

    public Carta siguienteCarta() {

        if (!baraja.getCartasBaraja().isEmpty()) {
            Carta cartaSiguiente = baraja.getCartasBaraja().remove(0);
            baraja.getCartasMonton().add(cartaSiguiente);
            return cartaSiguiente;
        }

        return null;
    }

    public int cartasDisponibles() {

        return baraja.getCartasBaraja().size();
    }

    public List<Carta> darCartas(int numCartas) {

        if (cartasDisponibles() >= numCartas) {

            List<Carta> cartasToDar = new LinkedList<>();
            for (int i = 0; i < numCartas; i++) {
                cartasToDar.add(siguienteCarta());
            }

            return cartasToDar;
        }

       return null;
    }

    public void cartasMonton() {

        if (!baraja.getCartasMonton().isEmpty()) {
            System.out.println("\nCartas en el Montón.");
            for (Carta carta : baraja.getCartasMonton()) {
                System.out.println(carta);
            }
        } else {
            System.out.println("\nAún no ha salido ninguna carta...");
        }
    }

    public void mostrarBaraja() {

        if (!baraja.getCartasBaraja().isEmpty()) {
            System.out.println("\nCartas en el Baraja.");
            for (Carta carta : baraja.getCartasBaraja()) {
                System.out.println(carta);
            }
        } else {
            System.out.println("\nYa no hay cartas en la Baraja...");
        }
    }
}
