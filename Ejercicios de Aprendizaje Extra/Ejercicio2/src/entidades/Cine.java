package entidades;

import java.util.ArrayList;

public class Cine {

    private String nombre;

    private ArrayList<Sala> salas;

    public Cine(String nombre) {
        this.nombre = nombre;
        salas = new ArrayList<>();
    }

    public Cine() {
        salas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
}
