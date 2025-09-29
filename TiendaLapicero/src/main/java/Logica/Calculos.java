
package Logica;

import Modelo.Lapicero;

public class Calculos {

    public static double calcularImporte(Lapicero lap) {
        return lap.getCantidad() * lap.getPrecioUnitario();
    }

    // Según docenas (o según la regla que definiste)
    public static double calcularDescuento(double importe, int cantidad) {
        if (cantidad >= 10) {
            return importe * 0.20; // 20%
        } else {
            return importe * 0.10; // 10%
        }
    }

    // Obsequios según importe total a pagar
    public static String calcularObsequio(int cantidad, double totalPagar) {
        if (totalPagar >= 200) {
            return (cantidad * 2) + " lapiceros";
        }
        return "Ninguno";
    }

    public static double calcularTotal(double importe, double descuento) {
        return importe - descuento;
    }
}


