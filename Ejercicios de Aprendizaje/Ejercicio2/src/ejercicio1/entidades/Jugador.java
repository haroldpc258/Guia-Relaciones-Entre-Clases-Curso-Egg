package ejercicio1.entidades;

public class Jugador {

    private Integer id;
    private String nombre;
    private Boolean muerto;

    public Jugador(Integer id) {
        this.id = id;
        nombre = "Jugador " + id;
    }

    public Boolean disparo(Revolver revolver) {

        muerto = revolver.disparar();
        revolver.siguienteRecamara();

        return muerto;
    }

    public String getNombre() {
        return nombre;
    }
}
