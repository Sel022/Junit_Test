package Mod_06_Project;

import java.util.Date;
//Selvadurai Pathmathasan CS_320_Mod_06_Project_Appointment
public class Appointment {
    private String appointmentId;
    private Date appointmentDate;
    private String description;

    public Appointment(String appointmentId, Date appointmentDate, String description) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    // Getters and setters

    public String getAppointmentId() {
        return appointmentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public String getDescription() {
        return description;
    }
}
