package com.reserva.reserva.service;
package com.reserva.reserva.service;


import com.medical.appointment.model.Appointment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppointmentService {
    private List<citas> Cita = new ArrayList<>();

    public AppointmentService() {
        // Inicializando algunas citas en memoria
        appointments.add(new Cita("1", "John Doe", LocalDateTime.of(2024, 8, 25, 10, 0)));
        appointments.add(new Cita("2", "John Doe", LocalDateTime.of(2024, 8, 25, 10, 0)));
        appointments.add(new Cita("3", "j", LocalDateTime.of(2024, 8, 25, 10, 0)));
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    public List<LocalDateTime> getAvailableSlots(LocalDateTime date) {
        List<LocalDateTime> allSlots = generateSlotsForDay(date);
        List<LocalDateTime> bookedSlots = appointments.stream()
            .map(Appointment::getAppointmentDateTime)
            .collect(Collectors.toList());

        return allSlots.stream()
            .filter(slot -> !bookedSlots.contains(slot))
            .collect(Collectors.toList());
    }

    private List<LocalDateTime> generateSlotsForDay(LocalDateTime date) {
        List<LocalDateTime> slots = new ArrayList<>();
        LocalDateTime start = date.withHour(9).withMinute(0);
        LocalDateTime end = date.withHour(17).withMinute(0);

        while (start.isBefore(end)) {
            slots.add(start);
            start = start.plusHours(1);
        }

        return slots;
    }
}
