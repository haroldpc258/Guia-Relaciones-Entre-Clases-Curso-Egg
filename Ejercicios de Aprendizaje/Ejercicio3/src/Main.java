import entidades.Baraja;
import servicios.BarajaService;


public class Main {
    public static void main(String[] args) {

        BarajaService bs = new BarajaService();
        Baraja baraja = bs.crearBaraja();

        bs.barajar();
        bs.mostrarBaraja();
        System.out.println("\nCartas disponibles: " + bs.cartasDisponibles());


        bs.siguienteCarta();
        bs.mostrarBaraja();
        System.out.println("\nCartas disponibles: " + bs.cartasDisponibles());

        bs.darCartas(10);
        bs.mostrarBaraja();
        System.out.println("\nCartas disponibles: " + bs.cartasDisponibles());

        bs.cartasMonton();

        bs.barajar();
        bs.mostrarBaraja();
        System.out.println("\nCartas disponibles: " + bs.cartasDisponibles());
    }
}