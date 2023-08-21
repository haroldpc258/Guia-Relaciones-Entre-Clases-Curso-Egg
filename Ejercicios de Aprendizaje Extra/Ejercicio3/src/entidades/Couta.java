package entidades;

import java.time.LocalDate;

public class Couta {

    private int numero;
    private double montoCouta;
    private boolean pagada;
    private LocalDate fechaVencimiento;
    private String formaPago;

    public Couta() {
    }

    public Couta(int numero, double montoCouta, LocalDate fechaVencimiento, String formaPago) {
        this.numero = numero;
        this.montoCouta = montoCouta;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMontoCouta() {
        return montoCouta;
    }

    public void setMontoCouta(double montoCouta) {
        this.montoCouta = montoCouta;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Couta{" +
                "numero=" + numero +
                ", montoCouta=" + montoCouta +
                ", pagada=" + pagada +
                ", fechaVencimiento=" + fechaVencimiento +
                ", formaPago='" + formaPago + '\'' +
                '}';
    }
}
