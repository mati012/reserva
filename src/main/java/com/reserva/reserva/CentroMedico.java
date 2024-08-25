package com.reserva.reserva;

public class CentroMedico {

    private int codigoCentroMedico;
    private String nombreCentroMedico;
    private String ubicacion;

    public CentroMedico( int codigoCentroMedico, String nombreCentroMedico, String ubicacion){

        this.codigoCentroMedico= codigoCentroMedico;
        this.nombreCentroMedico= nombreCentroMedico;
        this.ubicacion=ubicacion;

    }

    public int getCodigoCentroMedico() {
        return codigoCentroMedico;
    }

    public String getNombreCentroMedico() {
        return nombreCentroMedico;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    
}
