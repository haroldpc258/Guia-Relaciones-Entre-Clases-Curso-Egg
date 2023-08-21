package entidades;

import java.util.LinkedList;
import java.util.List;

public class Baraja {

    private List<Carta> cartasBaraja;
    private List<Carta> cartasMonton;


    public Baraja() {
        cartasBaraja = new LinkedList<>();
        cartasMonton = new LinkedList<>();
    }

    public Baraja(List<Carta> cartasBaraja, List<Carta> cartasMonton) {
        this.cartasBaraja = cartasBaraja;
        this.cartasMonton = cartasMonton;
    }

    public List<Carta> getCartasBaraja() {
        return cartasBaraja;
    }

    public void setCartasBaraja(List<Carta> cartasBaraja) {
        this.cartasBaraja = cartasBaraja;
    }

    public List<Carta> getCartasMonton() {
        return cartasMonton;
    }

    public void setCartasMonton(List<Carta> cartasMonton) {
        this.cartasMonton = cartasMonton;
    }
}
