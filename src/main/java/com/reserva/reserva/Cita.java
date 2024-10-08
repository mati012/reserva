package com.reserva.reserva;

import java.util.List;
import java.util.Map;
public class Cita {
    private int idCita;
    private String fechaCita;
    private List<Disponibilidad> disponibilidades; 
    private List <CentroMedico> centrosMedicos;
    private Map<String,String> profesional;

    public Cita(int idCita, String fechaCita, List<Disponibilidad> disponibilidades, List<CentroMedico> centrosMedicos, Map<String, String> profesional){
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.disponibilidades= disponibilidades;
        this.centrosMedicos= centrosMedicos;
        this.profesional= profesional;


    }

    public int getIdCita() {
        return idCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public List<Disponibilidad> getDisponibilidades() {
        return disponibilidades;
    }

    public List<CentroMedico> getCentrosMedicos() {
        return centrosMedicos;
    }

    public Map<String, String> getProfesional() {
        return profesional;
    }

    
}
