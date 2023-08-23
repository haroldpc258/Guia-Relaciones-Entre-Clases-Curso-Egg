package entidades;

import java.util.Comparator;
import java.util.Objects;

public class Alumno {

    private String nombreCompleto;
    private Integer dni;
    private Integer cantidadVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, Integer dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        cantidadVotos = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno alumno)) return false;
        return Objects.equals(getDni(), alumno.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }

    public static Comparator<Alumno> compararPorVoto() {

        return (alumno1, alumno2) -> alumno2.getCantidadVotos().compareTo(alumno1.getCantidadVotos());
        /*return new Comparator<>() {
            @Override
            public int compare(Alumno alumno1, Alumno alumno2) {
                return alumno2.getCantidadVotos().compareTo(alumno2.getCantidadVotos());
            }
        };*/
    }

    @Override
    public String toString() {
        return "Nombre Completo: '" + nombreCompleto + '\'' +
                ", DNI: " + dni +
                ", Cantidad de Votos: " + cantidadVotos;
    }
}
