package entidades;


import java.time.LocalDate;
import java.util.Arrays;

public class Poliza {

    private int numero;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private Couta[] cuotas;
    private String formaPago;
    private double montoAsegurado;
    private double valor;
    private boolean incluyeGranizo;
    private double montoMaximoGranizo;
    private String tipoCobertura;

    public Poliza() {
    }

    public Poliza(int numero, int coutas, String formaPago, double montoAsegurado, boolean incluyeGranizo, double montoMaximoGranizo, String tipoCobertura) {
        this.numero = numero;
        this.formaPago = formaPago;
        this.montoAsegurado = montoAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;

        fechaInicio = LocalDate.now();
        fechaFin = fechaInicio.plusYears(1);
        this.cuotas = new Couta[coutas];
        valor = (montoAsegurado + montoMaximoGranizo)*0.05;
    }

    public Poliza(int numero, int coutas, String formaPago, double montoAsegurado, String tipoCobertura) {
        this(numero, coutas, formaPago, montoAsegurado, false, 0, tipoCobertura);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Couta[] getCuotas() {
        return cuotas;
    }

    public void setCuotas(Couta[] cuotas) {
        this.cuotas = cuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Poliza{" +
                "numero=" + numero +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", formaPago='" + formaPago + '\'' +
                ", montoAsegurado=" + montoAsegurado +
                ", valor=" + valor +
                ", incluyeGranizo=" + incluyeGranizo +
                ", montoMaximoGranizo=" + montoMaximoGranizo +
                ", tipoCobertura='" + tipoCobertura + '\'' +
                ", cuotas=" + Arrays.toString(cuotas) +
                '}';
    }
}
