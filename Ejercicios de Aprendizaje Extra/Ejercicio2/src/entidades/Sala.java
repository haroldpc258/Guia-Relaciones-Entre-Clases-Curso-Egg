package entidades;

import java.util.Arrays;

public class Sala {

    private int numero;

    private Pelicula peliReproduciendo;

    private double precioEntrada;

    private Silla[][] sillas;
    private boolean salaLlena;

    public Sala(int numero) {
        this.numero = numero;
        sillas = new Silla[8][6];
    }

    public Sala() {
        sillas = new Silla[8][6];
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pelicula getPeliReproduciendo() {
        return peliReproduciendo;
    }

    public void setPeliReproduciendo(Pelicula peliReproduciendo) {
        this.peliReproduciendo = peliReproduciendo;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Silla[][] getSillas() {
        return sillas;
    }

    public void setSillas(Silla[][] sillas) {
        this.sillas = sillas;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "Número= Sala " + numero +
                ", peliReproduciendo=" + peliReproduciendo +
                ", precioEntrada=" + precioEntrada +
                '}';
    }
}
