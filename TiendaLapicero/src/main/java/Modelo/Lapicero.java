package Modelo;

public class Lapicero {
    private int cantidad;
    private double precioUnitario;

    public Lapicero(int cantidad, double precioUnitario) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}


