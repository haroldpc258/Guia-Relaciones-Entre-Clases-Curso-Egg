package entidades;

public class Silla {

    private Espectador espectador;
    private int fila;
    private char columna;
    private boolean ocupada;

    public Silla() {
    }

    public Silla(int fila, int columna) {
        this.fila = fila;
        this.columna = (char) (columna + 65);
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
