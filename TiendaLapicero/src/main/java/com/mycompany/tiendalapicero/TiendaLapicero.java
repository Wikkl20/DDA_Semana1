package com.mycompany.tiendalapicero;

import Vista.FrmTienda;

public class TiendaLapicero {
    public static void main(String[] args) {
        FrmTienda pantalla = new FrmTienda();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null); // centrar
    }
}

