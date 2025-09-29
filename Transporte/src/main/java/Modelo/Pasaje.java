
package Modelo;


public class Pasaje {
    private int cantidad;
    private String turno;
    private double precioUnitario;

    public Pasaje(int cantidad, String turno, double precioUnitario) {
        this.cantidad = cantidad;
        this.turno = turno;
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
