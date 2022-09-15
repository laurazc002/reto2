package clases;

public class Cliente {

    private String nombre;
    private String cedula;
    private String medioPago;
    private double saldoDisponible;

    public Cliente() {
    }

    public Cliente(String nombre, String cedula, String medioPago, double saldoDisponible) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.medioPago = medioPago;
        this.saldoDisponible = saldoDisponible;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
