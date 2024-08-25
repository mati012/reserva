package com.reserva.reserva;


import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CitaController {
    private List<Cita> citas = new ArrayList<>();
        
    public CitaController(){
        citas.add(new Cita(idCita:1,"12/12/2024","11:29", Arrays.asList(new Disponibilidad(codigoDisponibilidad:"a", disponible:'y')) ))
        citas.add(new Cita())
        citas.add(new Cita())



    }
    
}
