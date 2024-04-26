package Mod_06_Project;
//Selvadurai Pathmathasan CS_320_Mod_06_Project_Appointment
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AppointmentTest {
    @Test
    public void testAppointmentCreation() {
        Date currentDate = new Date();
        Appointment appointment = new Appointment("A1", currentDate, "Meeting with client");
        assertEquals("A1", appointment.getAppointmentId());
        assertEquals(currentDate, appointment.getAppointmentDate());
        assertEquals("Meeting with client", appointment.getDescription());
    }

}
