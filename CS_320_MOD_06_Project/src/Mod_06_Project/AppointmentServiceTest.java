package Mod_06_Project;
//Selvadurai Pathmathasan CS_320_Mod_06_Project_Appointment
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AppointmentServiceTest {
    @Test
    public void testAddAppointment() {
        AppointmentService appointmentService = new AppointmentService();
        Date currentDate = new Date();
        Appointment appointment = new Appointment("A1", currentDate, "Meeting with client");
        appointmentService.addAppointment(appointment);

        assertNotNull(appointmentService.getAppointmentById("A1"));
    }

}