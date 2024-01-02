package DBMS.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name="APPOINTMENT")
public class Appointment {
    @Id
    @Column(name="APPOINTMENT_ID")
    private int AppointmentID;
    @Column(name="PATIENT_ID")
    private int patientID;
    @Column(name="A_DATE")
    private Date date;
    @Column(name="A_TIME")
    private Time time;
    @Column(name="A_DENTIST_ID")
    private int dentist;

    public int getAppointmentID() {
        return AppointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        AppointmentID = appointmentID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getDentist() {
        return dentist;
    }

    public void setDentist(int dentist) {
        this.dentist = dentist;
    }
}
