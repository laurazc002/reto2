package clases;

public class Empanada {

    private String nombre;
    private String ingrediente;
    private int precioVenta;
    private int precioFabricacion;
    private int cantidad;

    public Empanada() {
    }

    public Empanada(String nombre, String ingrediente, int precioVenta, int precioFabricacion) {
        this.nombre = nombre;
        this.ingrediente = ingrediente;
        this.precioVenta = precioVenta;
        this.precioFabricacion = precioFabricacion;
    }

    public Empanada(String nombre, String ingrediente, int precioVenta, int precioFabricacion, int cantidad) {
        this.nombre = nombre;
        this.ingrediente = ingrediente;
        this.precioVenta = precioVenta;
        this.precioFabricacion = precioFabricacion;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getPrecioFabricacion() {
        return precioFabricacion;
    }

    public void setPrecioFabricacion(int precioFabricacion) {
        this.precioFabricacion = precioFabricacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int calcularVenta(){

        int resultadoTotal= this.cantidad * this.getPrecioVenta();

        return resultadoTotal;
    }
}
