package entidades;

import java.util.HashSet;
import java.util.Set;

public class Voto {

    Alumno alumno;

    Set<Alumno> votos;

    public Voto() {
        votos = new HashSet<>();
    }

    public Voto(Alumno alumno, Set<Alumno> votos) {
        this.alumno = alumno;
        this.votos = votos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Set<Alumno> getVotos() {
        return votos;
    }

    public void setVotos(Set<Alumno> votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "alumnoVoto=" + alumno +
                ", votos=" + votos +
                '}';
    }
}
