package com.reserva.reserva;

public class Disponibilidad {
    private String codigoDisponibilidad;
    private String hora;
    private char disponible;
    

    public Disponibilidad(String codigoDisponibilidad, String hora,  char disponible){

        this.codigoDisponibilidad= codigoDisponibilidad;
        this.hora= hora;
        this.disponible= disponible;
    }


    public String getCodigoDisponibilidad() {
        return codigoDisponibilidad;
    }
    public String getHora(){
        return hora;
    }


    public char getDisponible() {
        return disponible;
    }
    
}
