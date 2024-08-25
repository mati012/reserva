package com.reserva.reserva;

public class Disponibilidad {
    private String codigoDisponibilidad;
    private char disponible;

    public Disponibilidad(String codigoDisponibilidad, char disponible){

        this.codigoDisponibilidad= codigoDisponibilidad;
        this.disponible= disponible;
    }

    public String getCodigoDisponibilidad() {
        return codigoDisponibilidad;
    }

    public char getDisponible() {
        return disponible;
    }
    
}
