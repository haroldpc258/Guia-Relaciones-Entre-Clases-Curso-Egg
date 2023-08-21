package ejercicio1.entidades;

public class Revolver {

    private Integer posicionActual;
    private Integer posicionBala;

    public void cargar() {
        posicionActual = (int) (Math.random() * 6 + 1);
        posicionBala = (int) (Math.random() * 6 + 1);
    }

    public Boolean disparar() {
        return posicionActual.equals(posicionBala);
    }

    public void siguienteRecamara() {
        if (posicionActual < 6) {
            posicionActual++;
        }
        else {
            posicionActual = 1;
        }
    }

    @Override
    public String toString() {
        return "Posición Actual en la Recámara: " + posicionActual +
                "\nPosición de la Bala: " + posicionBala;
    }
}
