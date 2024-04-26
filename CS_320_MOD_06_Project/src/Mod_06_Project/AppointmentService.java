package Mod_06_Project;
//Selvadurai Pathmathasan CS_320_Mod_06_Project_Appointment
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    private Map<String, Appointment> appointments = new HashMap<>();

    public void addAppointment(Appointment appointment) {
        appointments.put(appointment.getAppointmentId(), appointment);
    }

    public void deleteAppointment(String appointmentId) {
        appointments.remove(appointmentId);
    }

    public void updateAppointment(Appointment updatedAppointment) {
        appointments.put(updatedAppointment.getAppointmentId(), updatedAppointment);
    }

    public Appointment getAppointmentById(String appointmentId) {
        return appointments.get(appointmentId);
    }
}
