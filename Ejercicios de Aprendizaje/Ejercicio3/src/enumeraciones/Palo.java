package enumeraciones;

public enum Palo {
    ESPADAS("Espadas"),
    BASTOS("Bastos"),
    OROS("Oros"),
    COPAS("Copas");

    private final String nombre;

    Palo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
