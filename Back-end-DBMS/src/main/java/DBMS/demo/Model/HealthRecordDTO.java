package DBMS.demo.Model;

import jakarta.persistence.Id;

import java.sql.Date;

public class HealthRecordDTO {
    @Id
    private int patientid;
    private int dentistid;
    private Date date;

    private int service;
    private String medicine_array;
    private String quanlity_array;

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public int getDentistid() {
        return dentistid;
    }

    public void setDentistid(int dentistid) {
        this.dentistid = dentistid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public String getMedicine_array() {
        return medicine_array;
    }

    public void setMedicine_array(String medicine_array) {
        this.medicine_array = medicine_array;
    }

    public String getQuanlity_array() {
        return quanlity_array;
    }

    public void setQuanlity_array(String quanlity_array) {
        this.quanlity_array = quanlity_array;
    }
}
