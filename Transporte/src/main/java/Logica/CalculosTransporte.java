package Logica;

import Modelo.Pasaje;

public class CalculosTransporte {

    // Importe base
    public static double calcularImporte(Pasaje p) {
        return p.getCantidad() * p.getPrecioUnitario();
    }

    // Descuento por cantidad
    public static double calcularDescuento(double importe, int cantidad) {
        if (cantidad >= 15) {
            return importe * 0.08; // 8%
        } else {
            return importe * 0.05; // 5%
        }
    }

    // Caramelos según total
    public static int calcularCaramelos(int cantidad, double totalPagar) {
        if (totalPagar > 200) {
            return cantidad * 2;
        }
        return 0;
    }

    // Total a pagar
    public static double calcularTotal(double importe, double descuento) {
        return importe - descuento;
    }
}

