package com.reserva.reserva;

// import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CitaController {
    private List<Cita> citas = new ArrayList<>();

    public CitaController() {
        citas.add(new Cita(1, "12/12/2024", "16:00", 
                Arrays.asList(new Disponibilidad("39B", 'y')), 
                Arrays.asList(new CentroMedico(1, "Centro Medico Alameda", "alameda 123")), 
                agregarProfesional("Anton", "medico general")));
         citas.add(new Cita(2, "13/12/2024", "11:29", 
                Arrays.asList(new Disponibilidad("35C", 'n')), 
                Arrays.asList(new CentroMedico(1, "Centro Medico Alameda", "alameda 123")), 
                agregarProfesional("Marco Antonio", "fonoaudiologia")));
        citas.add(new Cita(3, "15/12/2024", "9:29", 
                Arrays.asList(new Disponibilidad("34A", 'y')), 
                Arrays.asList(new CentroMedico(1, "Centro Medico Alameda", "alameda 123")), 
                agregarProfesional("Jose luis ", "ortodoncista")));
    }

    private Map<String, String> agregarProfesional(String nombre, String especialidad) {
        Map<String, String> retorno = new HashMap<>();
        retorno.put(nombre, especialidad);
        return retorno;
    }

    @GetMapping("/citas")
    public List<Cita> getCitas() {
        return citas;
    }
        @GetMapping("/citas/{idCita}")
    public Cita getcitaById(@PathVariable int idCita) {
       for (Cita cita: citas){
        if (cita.getIdCita()== idCita){
            return cita;
        }
       }
    return null;
    }
}
